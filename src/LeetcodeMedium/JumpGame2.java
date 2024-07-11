package LeetcodeMedium;

//Leetcode - 45
//https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class JumpGame2 {
    public static void main(String[] args) {
        int[] num= {2,3,1,1,4};
        System.out.println(jump(num));
    }
    public static int jump(int[] nums) {
        int count = 0;
        int index = 0;
        int jumps_req = nums.length-1;
        while(index <= nums.length-1) {
            if (canjump(nums, index, jumps_req)) {
                count += 1;
                return count;
            } else {
                jumps_req = jumps_req - nums[index];
                count+=1;
                index += nums[index];
            }
        }
        return count;
    }
    public static boolean canjump(int[] nums, int index,int jumps_req){
        return nums[index] >= jumps_req;
    }
}
