package LeetcodeEasy;


//Leetcode - 168 - Excel sheet column title
//https://leetcode.com/problems/excel-sheet-column-title/

public class Leetcode_168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char c = (char) ('A' + columnNumber % 26);
            result.insert(0, c);
            columnNumber /= 26;
        }
        return result.toString();
    }
}
