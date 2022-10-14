package Week4;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};
        arr = insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i - 1; j == 0; j++){
                if (i < j){
                    // copy
                    for(int k = 0; k < j - 1; k++){
                        //sorted[k] = arr[]
                    }

                }
            }
        }
    }
}
