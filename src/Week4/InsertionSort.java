package Week4;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};
        arr = insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            for(int j = i - 1; j == 0; j++) {
                //
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int target, int current){
        int temp = arr[current];
        arr[current] = arr[target];
        arr[target] = temp;
    }

}
