package beertocod.dsa.leetcode.algorithms;

import java.util.Arrays;

public class Sorting {




    public static int[] bubbleSort(int[] arr){
        for(int i=0; i< arr.length-1;i++){
            for(int j=0; j< arr.length-i-1;j++){
                /**
                 * Assuming sorting for ASC order
                 */
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.printf("Pass "+i + "=>  From Index "+i+" to "+(arr.length-i-1)+" "+ Arrays.toString(arr)+"\n");
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
        bubbleSort(arr);
    }


}
