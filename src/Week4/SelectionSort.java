package Week4;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        int[] sorted = selectionSort(arr);
        System.out.println(Arrays.toString(sorted));
    }

    // bublle sort revisited
    //
    public static int[] sort(int[] arr){
        for(int i = 0; i < arr.length; i++){

        }
    }
    public static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
