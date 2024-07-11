package LeetcodeEasy;

import java.util.Arrays;

//leetcode 1252 - Cells with odd values in a Matrix
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
//Time complexity - O(m*n + k(m+n))
//Space complexity - O(1)
public class Leetcode_1252 {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] arr = {{0,0,0},{0,0,0}};
        int[][] indices = {{0,1},{1,1}};
//        int[][] ans = oddCells(arr,m,n,indices);
//        for (int i = 0; i < ans.length; i++) {
//            System.out.println(Arrays.toString(ans[i]));
//        }
        System.out.println(oddCells(m,n,indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[][] arr = new int[m][n];
        //Time complexity - O(m*n)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }
        //k = indices length
        //Time complexity - O(k * (m + n))
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            for (int j = 0; j < n; j++) {
                arr[row][j] += 1;
            }
            for (int k = 0; k < m; k++) {
                arr[k][col] += 1;
            }
        }
        //Time complexity - O(m*n)
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                if(arr[i][j] % 2 != 0){
                    count += 1;
                }
            }
        }
        return count;
    }
}
