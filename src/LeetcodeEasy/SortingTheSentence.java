package LeetcodeEasy;

//Leetcode - 1859
//https://leetcode.com/problems/sorting-the-sentence/description/
public class SortingTheSentence {
    public static void main(String[] args) {

    }
    public String sortSentence(String s, int index, int start, int end) {
        index = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=s.length();i>=0;i--){
            if(s.charAt(i) == ' '){
                end = i;
            }
        }
        return "";
    }
}
