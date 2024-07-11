package LeetcodeMedium;
import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        int row = in.nextInt();
        getRow(row);
    }

     static List<Integer> getRow(int rowIndex) {
        int sum = 0;
        List<Integer> result = new ArrayList();
        if (rowIndex == 0) {
            result.add(1);
            return result;
        }
        int length = rowIndex + 1;
            result.add(0, 1);
            result.add(length, 1);
            for(int i=1;i<length;i++){

            }
        return result;
    }
}