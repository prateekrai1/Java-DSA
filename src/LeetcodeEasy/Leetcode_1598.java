package LeetcodeEasy;


//Leetcode - 1598 - Crawler Log Folder
//https://leetcode.com/problems/crawler-log-folder/description/?envType=daily-question&envId=2024-07-10
//Time complexity - O(n)
//Space complexity - O(1)
public class Leetcode_1598 {
    public static void main(String[] args) {
        String[] logs = {"./","wz4/","../","mj2/","../","../","ik0/","il7/"};
        System.out.println(minOperations(logs));
    }
    public static int minOperations(String[] logs) {
        int count = 0;
        for (int i = 0; i < logs.length; i++) {
            if(!(logs[i].equalsIgnoreCase("../") || logs[i].equalsIgnoreCase("./"))){
                count += 1;
            } else if (logs[i].equalsIgnoreCase("../") && count > 0) {
                count -= 1;
            }
            else {
                count+=0;
            }
        }
        return count;
    }
}
