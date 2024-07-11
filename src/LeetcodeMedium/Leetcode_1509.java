package LeetcodeMedium;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Leetcode - 1509 - Minimum Difference between largest and smallest value in three moves
//https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/?envType=daily-question&envId=2024-07-03
public class Leetcode_1509 {
    public static void main(String[] args) {
        int[] nums = {6,6,0,1,1,4,6};
        System.out.println(minDifference(nums));
    }
    public static int minDifference(int[] nums) {
        if(nums.length < 5){
            return 0;
        }
        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < 4; i++) {
            res = Math.min(res, nums[nums.length - 4 + i] - nums[i]);
        }
        return res;
    }
}
