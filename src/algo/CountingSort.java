package algo;

import java.util.Arrays;
import java.util.Random;
public class CountingSort {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        //int min = 0;
        //int max = 1000;
        //int[] input = random.ints(min, max).parallel().limit(100000000).toArray();
        int[] input = new int[]{0, 0, 1, 2, 3, 1, 2, 2, 3, 3, 3, 1, 1, 2, 2, 5, 5, 4, 4, 1, 0};
        CountingSort countingSort = new CountingSort();
        System.out.println(Arrays.toString(countingSort.sort(input, Arrays.stream(input).min().getAsInt(), Arrays.stream(input).max().getAsInt())));
    }

    public int[] sort(int[] input, int min, int max) {
        System.out.println(Arrays.toString(input));
        int counting[] = new int[max - min + 1];
//Compute the count of each item
        for (int number : input) {
            ++counting[number - min];
        }
        System.out.println(Arrays.toString(counting));
//Compute the total number of items occurring before the current item in sorted output (histogram)
        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }
        System.out.println(Arrays.toString(counting));
//Fill the output array with correct number of zeros, ones, twos and so on.
        int[] output = new int[input.length];
        for (int i : input) {
            output[counting[i - min] - 1] = i;
            --counting[i - min];
        }
        return output;
    }
}