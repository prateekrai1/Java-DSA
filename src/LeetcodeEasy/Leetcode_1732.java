package LeetcodeEasy;


//Leetcode 1732 - Find the highest Altitude
//https://leetcode.com/problems/find-the-highest-altitude/description/
//Time complexity - O(n)
//space complexity - O(1)
public class Leetcode_1732 {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int highest = 0;
        int currrent = 0;

        for(int i=0; i<gain.length; i++){
            currrent += gain[i];
            highest = Math.max(highest, currrent);
        }
        return highest;
    }
}
