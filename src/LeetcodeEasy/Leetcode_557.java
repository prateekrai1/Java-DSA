package LeetcodeEasy;


//Leetcode - 557 - Reverse words in String III
//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
public class Leetcode_557 {
    public static void main(String[] args) {
        String s = "Mr Ding";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(i< arr.length-1) {
                sb.append(reverse(arr[i]));
                sb.append(" ");
            }
            else sb.append(reverse(arr[i]));
        }
        return sb.toString();
    }
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
