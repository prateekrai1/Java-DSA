package LeetcodeEasy;

public class Palindrome {
    public static void main(String[] args) {
        boolean ans = isPalindrome(121, 0);
        System.out.println(ans);
    }

    public static boolean isPalindrome(int x, int num) {
        if(x < 0){
            return false;
        }
        if(x == 0){
            return num == x;
        }
        int rem = x %10;
        num = rem + x*10;
        return isPalindrome(x/10,num);
    }
}
