package Week4;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};
        arr = insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

