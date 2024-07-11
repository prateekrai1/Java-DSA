package GeeksForGeeks;

import java.util.Arrays;

//Geeks For Geeks - https://www.geeksforgeeks.org/sum-triangle-from-array/

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sumArray(arr);
    }
    public static void sumArray(int[] arr){
        if(arr.length == 1){
            System.out.println(arr[0]);
            return;
        }
        int[] temp = new int[arr.length-1];
        for(int i=0; i<arr.length-1;i++){
            temp[i] = arr[i] + arr[i+1];
        }
        sumArray(temp);
        System.out.println(Arrays.toString(arr));
    }
}
