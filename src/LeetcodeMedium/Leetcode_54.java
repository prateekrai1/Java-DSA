package LeetcodeMedium;

import java.util.ArrayList;
import java.util.List;

//Leetcode-54 - Spiral Matrix
//https://leetcode.com/problems/spiral-matrix/description/
//Time complexity - O(m*n)
//Space complexity - O(m*n)
public class Leetcode_54 {
    public static void main(String[] args) {
        int[][] mxn= {{1},{2},{3},{4}};
        System.out.println(spiralOrder(mxn));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0; int right = m-1;
        int top = 0; int bottom = n-1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <=right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
