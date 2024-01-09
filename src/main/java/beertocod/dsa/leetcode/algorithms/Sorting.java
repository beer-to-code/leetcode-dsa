package beertocod.dsa.leetcode.algorithms;

import java.util.Arrays;

public class Sorting {
    private static long startTime;
    public static int[] bubbleSort(int[] arr) {
        System.out.println("Bubble Sort");
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
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        System.out.println("Selection Sort");
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
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println();
        bubbleSort(arr);
        int[] arr2 = new int[]{1, 2, 4, 6, 7, 9, 3, 5, 8, 10};
        System.out.println();
        selectionSort(arr2);
    }


}
