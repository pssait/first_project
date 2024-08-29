package string.question3;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        /*    StringBuilder Approach
        StringBuilder b = new StringBuilder(A);
        b.reverse();
        System.out.println(A.compareTo(b.toString()) == 0 ? "Yes" : "No");*/
        // Without String Builder
        int len = A.length();
        int halfLen = len/2;
        int secondSub = len % 2 == 1 ? halfLen+1 : halfLen;
        String x = A.substring(0,halfLen);
        String y = A.substring(secondSub);
        boolean pali = true;
        for(int i = 0; i < halfLen; i++) {
            if(x.charAt(i) != y.charAt(halfLen-1-i)) {
                pali = false;
                break;
            }
        }
        System.out.println(pali ? "Yes" : "No");
    }
}



