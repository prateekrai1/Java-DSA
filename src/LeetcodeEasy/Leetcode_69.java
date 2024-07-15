package LeetcodeEasy;

public class Leetcode_69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int start = 1; int end = x;
        while(start <= end){
            int mid = (start + end)/2;
            if((long)mid * mid > (long)x){
                end = mid-1;
            }
            else if (mid*mid == x){
                return mid;
            }
       else {
           start = mid+1;
            }
       }
       return Math.round(end);
    }
}
