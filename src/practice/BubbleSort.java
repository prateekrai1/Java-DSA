package practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,8,2,15,10,232,45};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=1; j < arr.length; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
           if(!swapped) {
               break;
           }
        }
    }
}
