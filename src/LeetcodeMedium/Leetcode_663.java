package LeetcodeMedium;

public class Leetcode_663 {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
    }
    public static boolean judgeSquareSum(int c) {
        long left=0;
        long right = (long)Math.sqrt(c);

        while(left <= right){
            if(left * left + right * right == c){
                return true;
            }
            else if(left * left + right * right > c){
                right --;
            }
            else left++;
        }
        return false;
    }
}
