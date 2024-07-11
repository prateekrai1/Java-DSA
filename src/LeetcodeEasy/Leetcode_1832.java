package LeetcodeEasy;

import java.util.Arrays;

public class Leetcode_1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }
        for(char i='a';i<='z';i++){
            if(sentence.indexOf(i)<0){
                return false;
            }
        }
        return true;
    }
}
