package LeetcodeEasy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicatesFromArraytwo {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int ans = removeDuplicates(nums);
        System.out.println(ans);

    }
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i=1; i< nums.length;i++){
            if(j==1||  nums[i] != nums[j-2]){
                nums[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return j;
//        int p=0;
//        int number_of_elements =0;
//        while(p<nums.length){
//            int occ = occurences(nums,nums[p],p);
//            if(occ>1){
//                for(int i=p;i<p+occ;i++){
//                    nums[i] = nums[p];
//                }
//            }
//            p = p + occ;
//            if(occ > 2){
//                number_of_elements += 2;
//            }
//            else number_of_elements += occ;
//        }
//        System.out.println(Arrays.toString(nums));
//        return number_of_elements;
//    }
//    public static int occurences(int[] nums, int num,int p){
//        int count =0;
//        for(int i=p; i<nums.length;i++){
//            if(nums[i] == num){
//                count+=1;
//            }
//        }
//        return count;
    }
}
