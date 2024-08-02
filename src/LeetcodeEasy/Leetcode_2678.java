package LeetcodeEasy;


//Leetcode 2678 - Number of Senior citizens
//https://leetcode.com/problems/number-of-senior-citizens/?envType=daily-question&envId=2024-08-01

public class Leetcode_2678 {
    public static void main(String[] args) {
       String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
       System.out.println(countSeniors(details));
    }
    public static int countSeniors(String[] details) {
        int ans = 0;
        for (var x : details) {
            int age = Integer.parseInt(x.substring(11, 13));
            if (age > 60) {
                ++ans;
            }
        }
        return ans;
    }
}
