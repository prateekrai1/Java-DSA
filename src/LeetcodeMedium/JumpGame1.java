package LeetcodeMedium;

public class JumpGame1 {
    public static void main(String[] args) {
        int[]nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int goal = nums.length -1;
        for(int i=nums.length-2; i>=0; i--){
            if(i+nums[i] >= goal){
                goal = i;
            }
        }
        return goal == 0;
    }
}
