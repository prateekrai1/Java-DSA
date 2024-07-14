package LeetcodeMedium;

import java.util.Arrays;

//Leetcode - 59 - Spiral Matrix II
//https://leetcode.com/problems/spiral-matrix-ii/
//Time complexity - O()
//Space complexity - O()
public class Leetcode_59 {
    public static void main(String[] args) {
        int[][] ans =  generateMatrix(1);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] ans =  new int[n][n];
        int count = 1;
        int left = 0; int right = n-1;
        int top = 0; int bottom = n-1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                ans[top][i] = count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = count++;
            }
            right--;
            if(top <= bottom){
                for (int i = right; i >= left; i--) {
                    ans[bottom][i] = count++;
                }
                bottom--;
            }
            if(left <= right){
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = count++;
                }
                left++;
            }
        }
        return ans;
    }
}
