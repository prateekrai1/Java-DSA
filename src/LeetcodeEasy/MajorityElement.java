package LeetcodeEasy;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {8,8,7,7,7};
       System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int j =0;
        while(j<nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == nums[j]) {
                    count += 1;
                }
            }
            if(count>nums.length/2) {
                return nums[j];
            }
            j++;
            count =0;
        }
        return 0;
    }
}
