package LeetcodeEasy;


//Leetcode - 1704
//https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "Uo";
        System.out.println(halvesAreAlike(s,0,s.length()-1,0,0));
    }
    public static boolean halvesAreAlike(String s, int start, int end, int leftcount, int rightcount) {
        char[] ch = s.toLowerCase().toCharArray();
        if(start>end){
            return leftcount == rightcount;
        }
        if(ch[start] == 'a' || ch[start] == 'e' || ch[start] == 'i' || ch[start] == 'o' || ch[start] == 'u'){
            leftcount += 1;
        }
        if(ch[end] == 'a' || ch[end] == 'e' || ch[end] == 'i' || ch[end] == 'o' || ch[end] == 'u'){
            rightcount += 1;
        }
        return halvesAreAlike(s,start+1,end-1,leftcount,rightcount);
    }
}
