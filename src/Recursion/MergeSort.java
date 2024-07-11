package Recursion;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,5,7,4,8,62,665,8, 4, 10, 10,15};
        arr = mergerSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergerSort(int[]arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergerSort(Arrays.copyOfRange(arr, 0,mid));
        int[] right = mergerSort(Arrays.copyOfRange(arr,mid, arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] left, int[] right) {

        int[] sorted = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i<left.length && j<right.length) {
            if (left[i] < right[j]) {
                sorted[k] = left[i];
                i++;
            } else {
                sorted[k] = right[j];
                j++;
            }
            k++;
        }

        //It may be possible that one array is longer
        while (i < left.length) {
            sorted[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            sorted[k] = right[j];
            j++;
            k++;
        }
        return sorted;
    }
}
