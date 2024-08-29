package string.question4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        String x = a.toLowerCase();
        String y = b.toLowerCase();
        if(x.length() != y.length()) return false;
        if (x.equals(y)) return true;
        Map<Character,Integer> xMap = new HashMap<>();
        Map<Character,Integer> yMap = new HashMap<>();

        x.chars().mapToObj(i -> (char)i).forEach(c -> {
            Integer currentVal = xMap.putIfAbsent(c, 1);
            if(currentVal != null) xMap.put(c,currentVal+1);
        });
        y.chars().mapToObj(i -> (char)i).forEach(c -> {
            Integer currentVal = yMap.putIfAbsent(c, 1);
            if(currentVal != null) yMap.put(c,currentVal+1);
        });

        return xMap.equals(yMap);
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
