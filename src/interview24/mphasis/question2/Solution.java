package interview24.mphasis.question2;

import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        String a = "Sulaiman";
        int len = a.length();
        HashMap<Character,Integer> counter = new HashMap<>();
        Stream<Character> s = a.chars().mapToObj(e -> (char)e);
        s.forEach(c -> {
            Integer current = counter.get(c);
            if(current != null){
                counter.put(c,current + 1);
            }
            counter.putIfAbsent(c, 1);
        });
        System.out.println(counter.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get());
        System.out.println(List.of(counter));

    }
}
