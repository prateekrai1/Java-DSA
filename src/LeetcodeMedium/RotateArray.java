package LeetcodeMedium;

import java.util.Arrays;

//Leetcode - 189 - Rotate Array
//(AB)^T = B^T A^T in matrix theory
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        int k=2;
        rotate(nums,k);
    }
    public static void rotate(int[] nums, int k) {
        if(k==0){
            return;
        }
        int temp;
        int p = nums.length;
        temp = nums[0];
        nums[0] = nums[nums.length-1];

        while (nums[p - 1] != nums[p - 2]) {
            swap(nums, nums[p - 1], nums[p - 2], p);
            p--;
        }
        nums[p - 1] = temp;
        rotate(nums,k-1);
        System.out.println(Arrays.toString(nums));
    }

    private static int[] swap(int[] nums,int num1, int num2,int p) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        nums[p-1] = num1;
        nums[p-2] = num2;
        return nums;
    }
}
