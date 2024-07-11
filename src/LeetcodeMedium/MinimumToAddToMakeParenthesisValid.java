package LeetcodeMedium;


import java.util.Stack;

//Minimum Add to Make Parentheses Valid
//Leetcode - 932
//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
public class MinimumToAddToMakeParenthesisValid {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("()))(("));
    }
    public static int minAddToMakeValid(String s) {
        Stack<Character> parantheses = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == ')'){
                if(!parantheses.isEmpty() && parantheses.peek() == '('){
                    parantheses.pop();
                }else {
                    parantheses.push(ch);
                }
            }
            else {
                parantheses.push(ch);
            }
        }
        return parantheses.size();
    }
}
