package LeetcodeEasy;

//Leetcode - 1662 - Check if two Strings are equivalent
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
public class CheckIfTwoStringsAreEquivalent {
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[] {"abc", "d", "defg"},new String[] {"abcddefg"}));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(int i=0; i<word1.length; i++){
            s1.append(word1[i]);
        }
        for(int i=0; i<word2.length; i++){
            s2.append(word2[i]);
        }
        return s1.compareTo(s2) == 0;
    }
}
