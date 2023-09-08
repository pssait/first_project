package hackerrank.day1.two;

import java.io.*;
import java.math.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        List<BigInteger> sumList = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            List<Integer> fours = new ArrayList<>(arr);
            fours.remove(i);
            AtomicReference<BigInteger> sum = new AtomicReference<>(new BigInteger(String.valueOf(0)));
            fours.forEach(element -> {
                sum.set(sum.get().add(new BigInteger(String.valueOf(element))));
            });
            sumList.add(sum.get());
        }

        Optional<BigInteger> min = sumList.stream().min(BigInteger :: compareTo);
        Optional<BigInteger> max = sumList.stream().max(BigInteger :: compareTo);

        System.out.println(min.get() + " " + max.get());

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
