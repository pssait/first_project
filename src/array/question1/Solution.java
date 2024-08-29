package array.question1;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        int count = 0;
        for(int x=0; x<n; x++) {
            for(int y=x; y<n; y++) {
                int sum = 0;
                for (int z=x; z<=y; z++) {
                    sum += a[z];
                }
                if(sum < 0) count++;
            }
        }
        System.out.println(count);
    }
}