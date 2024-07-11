package LeetcodeEasy;

import java.util.ArrayList;
import java.util.Arrays;

public class Removekelemetn {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int val = 2;
        int[] ans= removeElement(arr,val);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] removeElement(int[] nums, int val) {
        int p=0;
        int[] ans = new int[nums.length];

        while(p < nums.length){
            if(nums[p] != val){
                ans[p] = nums[p];
            }
            p++;
        }
        return ans;
    }

}
