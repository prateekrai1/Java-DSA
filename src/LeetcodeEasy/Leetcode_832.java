package LeetcodeEasy;
import java.util.Arrays;


//Leetcode 832 - Flipping an image
//https://leetcode.com/problems/flipping-an-image/description/
//Time complexity - O(2n) where n are number of elements
//Space complexity - O(n) where n are number of elements

public class Leetcode_832 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] flipped = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                flipped[i][j] = image[i][image[i].length - 1 - j];
            }
        }
        for (int i = 0; i < flipped.length; i++) {
            for (int j = 0; j < flipped[i].length; j++) {
                if (flipped[i][j] == 1){
                    flipped[i][j] = 0;
                }
                else {
                    flipped[i][j] = 1;
                }
            }
        }
        return flipped;
    }
}
