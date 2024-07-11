package LeetcodeEasy;


//Leetcode - 1967 - Number Of Strings That Appear As Substrings In Word
//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public static void main(String[] args) {
        String[] patterns = new String[] {"a","b","c"};
        String word = "aaaaabbbbb";
        System.out.println(numOfStrings(patterns,word));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i=0; i<patterns.length;i++){
            if(word.contains(patterns[i])){
                count+=1;
            }
        }
        return count;
    }
}
