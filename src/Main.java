public class Main {
    public static int findClosestToAverage(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / array.length;
        System.out.println(average);
        double minDiff = Math.abs(array[0] - average);
        int closestIndex = 0;

        for (int i = 1; i < array.length; i++) {
            double diff = Math.abs(array[i] - average);
            if (diff < minDiff) {
                minDiff = diff;
                closestIndex = i;
            }
        }

        return closestIndex;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int closestIndex = findClosestToAverage(array);
        System.out.println("Index of the element closest to the average: " + closestIndex);
    }
}