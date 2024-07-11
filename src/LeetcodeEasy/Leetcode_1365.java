package LeetcodeEasy;

import java.util.Arrays;

//Leetcode_1365 - How many numbers are smaller than the current number
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
public class Leetcode_1365 {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int checkElement = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < checkElement){
                    count+=1;
                }
            }
            ans[i] = count;
            count = 0;
        }
        return ans;
    }
}
