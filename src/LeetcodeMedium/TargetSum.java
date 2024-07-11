package LeetcodeMedium;


//Leetcode - 314
//https://leetcode.com/problems/target-sum/description/
public class TargetSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(findTargetSumWays(nums,3,0,0));
    }

    public static int findTargetSumWays(int[] nums, int target, int sum, int index) {
        if(index == nums.length)
        {
            if(sum == target) {
                return 1;
            }
            else {
                return 0;
            }
        }

        int left = findTargetSumWays(nums,target,sum+nums[index],index+1);
        int right = findTargetSumWays(nums,target,sum-nums[index],index+1);
        return left+right;
    }
}
