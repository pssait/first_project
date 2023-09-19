package interview.optimum.question1;

public class Solution {
    public static void main(String[] args) {
//input : ZXCV
//output VCXZ
        StringBuilder sample = new StringBuilder("ZXCV");
        sample.reverse();
        System.out.println(sample);

        String sample2 = "ZXCV";
        int len = sample2.length();
        char[] charSample = new char[len];
        for(int i = len-1 ; i >= 0; i-- ) {
            charSample[i] = sample2.charAt(len-i-1);
        }
        String output = new String(charSample);
        System.out.println(output);
    }
}
