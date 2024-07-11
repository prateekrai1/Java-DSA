package LeetcodeMedium;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        longest("",s);
    }

    static void longest(String p, String up){
        char ch = up.charAt(0);
        if(contains(p,ch) == true){
            System.out.println(p.length());
        }
        else {
            longest(p+ch,up.substring(1));
        }
    }

    static boolean contains(String p, char c){
        for(int i=0; i<p.length(); i++){
            if(p.charAt(i) == c){
                return true;
            }
        }
        return false;
    }
}
