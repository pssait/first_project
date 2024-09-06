package interview24.paypal.question2;

public class Solution {
    //penagram
    //[3:28 PM] Bavishree Parameswaran
    //“Abcdefghijklmnopqrstuvwxyz”
    //
    //"The quick brown fox jumps over the lazy dog"
    public static void main(String[] args) {
        String in =  "Abcdghijklmnopqrstuvwxyz123";
        String lower = in.toLowerCase();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        boolean pen = true;
        for(int i = 0; i < alpha.length() ; i++){
            int index = lower.indexOf(alpha.charAt(i));
            if(index == -1) {
                pen = false;
                break;
            }
        }
        System.out.println( pen ? "Penagram" : "Not Penagram");
    }
}
