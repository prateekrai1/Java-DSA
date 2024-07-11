package LeetcodeEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_350 {
    public static void main(String[] args) {
        int nums1[] = {4,9,5};
        int [] nums2 = {9,4,9,8,4};
        List<Integer>ans = intersect(nums1, nums2);
        System.out.println(ans);
    }
    public static List<Integer> intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        int i,j;
        if(nums1.length > nums2.length){
            i = nums1.length;
            j = nums2.length;
        }
        else {
            j = nums1.length;
            i = nums2.length;

        }
        ans = findIntersect(ans, nums1, nums2, i, j);
        return ans;
    }

    private static List<Integer> findIntersect(List<Integer> ans, int[] nums1, int[] nums2, int i, int j) {
        int p2=0;
            for( int p1=0; p1<i;p1++){
                if(p2 == nums2.length){
                    return ans;
                }
                if(nums1[p1] == nums2[p2]){
                    ans.add(nums2[p2]);
                    p2++;
                }
            }
            return ans;
    }
}
