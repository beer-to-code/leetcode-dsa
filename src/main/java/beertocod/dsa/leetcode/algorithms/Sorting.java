package beertocod.dsa.leetcode.algorithms;

import java.util.Arrays;

/**
 * @class Sorting implements the sorting algorithms
 * @method bubbleSort(int[] arr), selectionSort(int[] arr),insertionSort(int[] arr),
 */
public class Sorting {

    /**
     * TODO : Sort and array of integer in ASC order , using bubble sort algorithm
     *
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        System.out.println("Bubble Sort over => "+Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                /**
                 * Assuming sorting for ASC order
                 */
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.printf("Pass " + i + "=>  From Index " + i + " to " + (arr.length - i - 1) + " " + Arrays.toString(arr) + "\n");
        }
        System.out.println(Arrays.toString(arr)+"\n\n");
        return arr;
    }

    /**
     * TODO : Sort and array of integer in DESC order , using selection sort algorithm
     *
     * @param arr
     * @return
     */
    public static int[] selectionSort(int[] arr) {
        System.out.println("Selection Sort => "+Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            /**
             * Assuming sorting for DESC order
             */
            int indexOfMinimum = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexOfMinimum]) {
                    indexOfMinimum = j;
                }
            }
            int temp = arr[indexOfMinimum];
            arr[indexOfMinimum] = arr[i];
            arr[i] = temp;
            System.out.printf("Pass " + i + "=> " + Arrays.toString(arr) + "\n");
        }
        System.out.println(Arrays.toString(arr)+"\n\n");
        return arr;
    }

    /**
     * TODO : Sort and array of integer in ASC order , using insertion sort algorithm
     *
     * @param arr
     * @return
     */
    public static int[] insertionSort(int[] arr) {
        System.out.println("Insertion Sort => "+Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) { /** Iterate over entire array */
            int j = i;
            /**
             * Assuming sorting for ASC order
             */
            while (j > 0 && arr[j - 1] < arr[j]) { /** iterate backwards over each element and swap if needed */
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--; /** decrease the counter to get the previous value */
            }
            System.out.printf("Pass " + i + "=> " + Arrays.toString(arr) + "\n");
        }
        System.out.println(Arrays.toString(arr)+"\n\n");
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 6, 7, 9, 3, 5, 8, 10};
        System.out.println();
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
    }

    /**
     * Bubble Sort over => [1, 2, 4, 6, 7, 9, 3, 5, 8, 10]
     * Pass 0=>  From Index 0 to 9 [2, 4, 6, 7, 9, 3, 5, 8, 10, 1]
     * Pass 1=>  From Index 1 to 8 [4, 6, 7, 9, 3, 5, 8, 10, 2, 1]
     * Pass 2=>  From Index 2 to 7 [6, 7, 9, 4, 5, 8, 10, 3, 2, 1]
     * Pass 3=>  From Index 3 to 6 [7, 9, 6, 5, 8, 10, 4, 3, 2, 1]
     * Pass 4=>  From Index 4 to 5 [9, 7, 6, 8, 10, 5, 4, 3, 2, 1]
     * Pass 5=>  From Index 5 to 4 [9, 7, 8, 10, 6, 5, 4, 3, 2, 1]
     * Pass 6=>  From Index 6 to 3 [9, 8, 10, 7, 6, 5, 4, 3, 2, 1]
     * Pass 7=>  From Index 7 to 2 [9, 10, 8, 7, 6, 5, 4, 3, 2, 1]
     * Pass 8=>  From Index 8 to 1 [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
     * [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
     *
     *
     * Selection Sort => [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
     * Pass 0=> [1, 9, 8, 7, 6, 5, 4, 3, 2, 10]
     * Pass 1=> [1, 2, 8, 7, 6, 5, 4, 3, 9, 10]
     * Pass 2=> [1, 2, 3, 7, 6, 5, 4, 8, 9, 10]
     * Pass 3=> [1, 2, 3, 4, 6, 5, 7, 8, 9, 10]
     * Pass 4=> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     * Pass 5=> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     * Pass 6=> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     * Pass 7=> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     * Pass 8=> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     * Pass 9=> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     *
     *
     * Insertion Sort => [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     * Pass 0=> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     * Pass 1=> [2, 1, 3, 4, 5, 6, 7, 8, 9, 10]
     * Pass 2=> [3, 2, 1, 4, 5, 6, 7, 8, 9, 10]
     * Pass 3=> [4, 3, 2, 1, 5, 6, 7, 8, 9, 10]
     * Pass 4=> [5, 4, 3, 2, 1, 6, 7, 8, 9, 10]
     * Pass 5=> [6, 5, 4, 3, 2, 1, 7, 8, 9, 10]
     * Pass 6=> [7, 6, 5, 4, 3, 2, 1, 8, 9, 10]
     * Pass 7=> [8, 7, 6, 5, 4, 3, 2, 1, 9, 10]
     * Pass 8=> [9, 8, 7, 6, 5, 4, 3, 2, 1, 10]
     * Pass 9=> [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
     * [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
     *
     *
     *
     * Process finished with exit code 0
     */
}
