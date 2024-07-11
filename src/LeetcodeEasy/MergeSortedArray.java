package LeetcodeEasy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int [] nums2 = {1};
        int m = 0;
        int n = 1;
        int[] ans = merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(ans));
    }
    static public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int f = 0;
        int s = 0;
        int index = 0;

        int[] sorted = new int[m+n];
        while(f < m && s < n){
            if(nums1[f] < nums2[s]){
                sorted[index] = nums1[f];
                f++;
            }
            else{
                sorted[index] = nums2[s];
                s++;
            }
            index++;
        }

        while(f < m){
            sorted[index] = nums1[f];
            f++;
            index++;
        }
        while(s < n){
            sorted[index] = nums2[s];
            s++;
            index++;
        }
        return sorted;
    }
}
