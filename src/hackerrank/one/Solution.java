package hackerrank.one;

import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void print(BigDecimal element) {
        DecimalFormat formatter = new DecimalFormat("#0.000000");
        System.out.println(formatter.format(element));
    }
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        AtomicInteger positive = new AtomicInteger();
        AtomicInteger negative = new AtomicInteger();
        AtomicInteger zero = new AtomicInteger();
        AtomicInteger len = new AtomicInteger(arr.size());

        arr.forEach(element -> {
            if(element == 0) zero.getAndIncrement();
            else if (element > 0) positive.getAndIncrement();
            else negative.getAndIncrement();
        });

        float lenFloat = len.floatValue();

        BigDecimal posProb = BigDecimal.valueOf(positive.floatValue() / lenFloat);
        print(posProb);

        BigDecimal negProb = BigDecimal.valueOf(negative.floatValue() / lenFloat);
        print(negProb);

        BigDecimal zeroProb = BigDecimal.valueOf(zero.floatValue() / lenFloat);
        print(zeroProb);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
