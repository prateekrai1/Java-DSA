package LeetcodeEasy;

//Leetcode - 680 - Valid palindrom II
//https://leetcode.com/problems/valid-palindrome-ii/
public class Leetcode_680 {
    public static void main(String[] args) {
        String s="cbbcc";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
            int start = 0;
            int end = s.length() - 1;

            while (start < end) {
                if (s.charAt(start) != s.charAt(end)) {
                    return removedCheck(s, start + 1, end) || removedCheck(s, start, end - 1);
                }
                start++;
                end--;
            }
            return true;
        }
        private static boolean removedCheck (String s,int x, int y){
            while (x < y) {
                if (s.charAt(x) != s.charAt(y)) {
                    return false;
                }
                x++;
                y--;
            }
            return true;
        }
}
