package LeetcodeEasy;

public class Leetcode_1572 {
    public static void main(String[] args) {
        int[][] mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        if(mat.length < 2){
            return sum + mat[0][0];
        }
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[i][mat.length-i-1];
        }
        if(mat.length % 2 != 0){
            int mid = mat.length / 2;
            sum -= mat[mid][mid];
        }
        return sum;
    }

}
