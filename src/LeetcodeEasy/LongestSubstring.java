package LeetcodeEasy;


//Longest Substring
public class LongestSubstring {
    public static void main(String[] args) {
        longestSubstring("", new String[]{"flower", "flow", "flight"});
    }

    static String longestSubstring(String p, String[] up){
        StringBuilder pBuilder = new StringBuilder(p);
        for(int i = 0; i<up[0].length(); i++) {
            char ch = up[0].charAt(i);
            for(int j=1; j<up.length;j++){
                if( i >= up[0].length() || up[j].charAt(i) != ch){
                     return pBuilder.toString();
                }
            }
            pBuilder.append(ch);
        }
        return p = pBuilder.toString();
    }
}
