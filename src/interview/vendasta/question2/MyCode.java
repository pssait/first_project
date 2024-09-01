package interview.vendasta.question2;

import java.util.ArrayList;
import java.util.Scanner;

class MyCode {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int books = sc.nextInt();
    int max = sc.nextInt();
    int minColumn = sc.nextInt();

    ArrayList<Integer> shelf = new ArrayList<Integer>();
    //I made it
    int bal = books % minColumn;
    int selfOne = books/minColumn;
    for(int i = 0 ; i < minColumn-1 ; i++) shelf.add(selfOne);
    shelf.add(selfOne + bal);

    Integer newMaxShelf = shelf.stream().max(Integer::compareTo).get();

    while(newMaxShelf > max) {
      shelf.remove(newMaxShelf);
      shelf.add(newMaxShelf/2);
      shelf.add((newMaxShelf/2)+(newMaxShelf%2));
      newMaxShelf = shelf.stream().max(Integer::compareTo).get();
    }
    shelf.forEach(System.out :: println);
    System.out.println(shelf.size());

  }
}