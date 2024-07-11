package LeetcodeMedium;

//Leetcode - 274
public class HIndex {
    public static void main(String[] args) {
        int[] cit = {100};
        System.out.println(hIndex(cit));
    }
    public static int hIndex(int[] citations) {
        if(citations.length == 1 && citations[0]!=0){
            return 1;
        }
        //int average_citations;
        int sum = 0;
        for(int i=0; i<citations.length; i++){
            sum += citations[i];
        }
        if(sum == 0){
            return 0;
        }
        return sum/citations.length;
    }

}
