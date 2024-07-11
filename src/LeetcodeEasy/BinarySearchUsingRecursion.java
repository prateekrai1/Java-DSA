package LeetcodeEasy;

import Trees.BinarySearchTree;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int ans = BinarySearch(arr,13,0,arr.length-1);
        System.out.println(ans);
    }
    public static int BinarySearch(int[]arr, int target, int s, int e){
        int mid = (s+e)/2;
        if(s > e){
            return -1;
        }
        if(target == arr[mid]){
            return mid;
        }
        if(target > arr[mid]){
            s = mid+1;
        }
        if(target < arr[mid]){
            e = mid-1;
        }
        return BinarySearch(arr,target,s,e);
    }
}
