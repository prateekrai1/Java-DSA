package LeetcodeEasy;

//Leetcode - 28 - Find the Index of First occurrence in a String
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
// Intuition - We will only check for the index if the haystack contains the needle, else we will not iterate
// If it contains, then we will iterate through the array, if the substring equals the needle, we return the 1st index of the substring
public class Leetcode_28 {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
                if(haystack.substring(i,j).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
