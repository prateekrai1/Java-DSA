package LeetcodeMedium;

import java.util.Arrays;
import java.util.Stack;

//Leetcode - 1190 - Reverse Substrings Between each pair of paranthesis
//https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/?envType=daily-question&envId=2024-07-11
//Time Complexity - O(N) + O(N) + O(N) = O(3N) => O(N)
//Space Complexity - O(N)
public class leetcode_1190 {
    public static void main(String[] args) {
        String s = "(ed(et(oc))el)";
        System.out.println(reverseParentheses(s));
    }
    public static String reverseParentheses(String s) {
        //Space Complexity - O(N)
        Stack<Integer> stack = new Stack<>();
        //Space Complexity - O(N)
        StringBuilder sb = new StringBuilder();
        //Time complexity - O(N)
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(sb.length());
            }
            else if(ch == ')'){
                int start = stack.pop();
                reverse(sb,start,sb.length() - 1);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void reverse(StringBuilder rev , int start , int end) {
        //Time complexity - O(K) where K is number of elements. happens across string s, hence, O(N)
        while (start < end) {
            char temp = rev.charAt(start);
            rev.setCharAt(start++, rev.charAt(end));
            rev.setCharAt(end--, temp);
        }
    }
}
