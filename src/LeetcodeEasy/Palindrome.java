package LeetcodeEasy;

public class Palindrome {
    public static void main(String[] args) {
        boolean ans = isPalindrome(-1331, 0, -1331);
        System.out.println(ans);

    }

    public static boolean isPalindrome(int x, int num, int temp) {
        if(x < 0){
            return false;
        }
        if(x == 0){
            return num==temp;
        }
        int rem = x %10;
        num = num*10 + rem;
        return isPalindrome(x/10,num, temp);
    }
}
