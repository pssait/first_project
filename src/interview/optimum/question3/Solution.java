package interview.optimum.question1;

public class Solution {
    // Nth non repeatable character
    public static void main(String[] args) {
        String a = "notification";
        int n = 1;
        int count = 0;
        for(int i = 0; i < a.length(); i++) {
            char current = a.charAt(i);
            if(a.indexOf(current) == a.lastIndexOf(current)) {
                count++;
                if(count == n) {System.out.println(current);}
            }
        }

        // Stream , distinct , collect . get(n-1)
        // Stream,
    }
}
