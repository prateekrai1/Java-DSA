package LeetcodeMedium;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String ans = longest("cbbd");
        System.out.println(ans);
    }
    static String longest(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            String ans = checkForPalindrome("",s.substring(i,s.length()-1),ch,i);
            if(isreversed(ans)) {
                return ans;
            }
        }
        return "";
    }

    static String checkForPalindrome(String p,String up, char ref, int index){
        if(isreversed(p)){
            return p;
        }
        if(up.isEmpty()){
            return p;
        }
        char append = up.charAt(index);
        return checkForPalindrome(p+append,up.substring(1),ref,index);
    }

    static boolean isreversed(String p){
        StringBuilder resversed = new StringBuilder();
        for(int i=0;i<p.length();i++){
            resversed.append(p.charAt(p.length()-1-i));
        }
        if(resversed.length() > 1){
            if(resversed.toString().equalsIgnoreCase(p) && (!resversed.isEmpty())){
                return true;
            }
        }
        return false;
    }
}
