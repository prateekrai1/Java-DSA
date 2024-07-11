package LeetcodeEasy;

import java.util.Arrays;

//Leetcode - 1108
//https://leetcode.com/problems/defanging-an-ip-address/description/
public class DefangingAnIPAddress {
    public static void main(String[] args) {
        System.out.println(defanged("1.1.1.1"));
    }
    public static String defanged(String str){
        //char[] ch = str.toCharArray();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == '.'){
                ans.append("[.]");
            }
            else ans.append(str.charAt(i));
        }
        return ans.toString();
    }
}
