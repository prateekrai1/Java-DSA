package LeetcodeEasy;

import java.util.Stack;



//Valid Parentheses
//Leetcode -  20
//https://leetcode.com/problems/valid-parentheses/description/

public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println(isValid("{(({"));
    }
    static boolean isValid(String s){
        if(s.isEmpty()){
            return false;
        }
        Stack<Character> parantheses = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                parantheses.push(ch);
            }
            else{
                if(ch == '}'){
                    if(parantheses.isEmpty() || parantheses.pop() != '{'){
                        return false;
                    }
                }
                if(ch == ')'){
                    if(parantheses.isEmpty() || parantheses.pop() != '('){
                        return false;
                    }
                }
                if(ch == ']'){
                    if(parantheses.isEmpty() || parantheses.pop() != '['){
                        return false;
                    }
                }
            }
        }
        return parantheses.isEmpty();
    }
}
