package LeetcodeEasy;

import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet",indices));
    }
    public static String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
}
