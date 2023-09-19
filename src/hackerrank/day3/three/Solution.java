package hackerrank.day3.three;

import java.io.*;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        //65-90 97-122
        StringBuilder result = new StringBuilder();
        s.chars().mapToObj(i -> (char)i).forEach( charElement -> {
            boolean capital = (charElement >= 'A' && charElement <= 'Z');
            boolean small = (charElement >= 'a' && charElement <= 'z');
            boolean charConditionBoolean = capital || small;
            int oneChar = (charConditionBoolean ? (charElement + (k % 26)) : charElement);
            if(capital && oneChar > 'Z') oneChar = (oneChar % 'Z') + 'A' - 1;
            if(small && oneChar > 'z') oneChar = (oneChar % 'z') + 'a' - 1;
            result.append((char)oneChar);
        });
        return result.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
