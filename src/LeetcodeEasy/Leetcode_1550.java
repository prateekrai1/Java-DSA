package LeetcodeEasy;

public class Leetcode_1550 {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(threeConsecutiveOdds(arr));
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0; i< arr.length ; i++){
            if(i+2 < arr.length) {
                if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
