package LeetcodeEasy;

import java.util.Arrays;

//Leetcode - 344

public class ReverseString {
    public static void main(String[] args) {
        char[] chars = {'h','e','l','l','l','o'};
        char[] ans = reverseString(chars,0,chars.length-1);
        System.out.println(Arrays.toString(ans));
    }
    public static char[] reverseString(char[] chars, int s, int e){
        if(s==e || s>e){
            return chars;
        }
        swap(chars,s,e);
        s++;
        e--;
        return reverseString(chars,s,e);
    }

    public static char[] swap(char[] chars, int s, int e){
        char temp = chars[s];
        chars[s] = chars[e];
        chars[e] = temp;
        return chars;
    }
}
