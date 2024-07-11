package LeetcodeMedium;

public class GoodNumber {
    public static void main(String[] args) {
        countGoodNumbers(3);
    }
    public static int countGoodNumbers(long n) {
        int count = 0;
        int min = (int)Math.pow(10,n-1);
        int max = (int)Math.pow(10,n) -1;
        for(int i=min; i<max;i++){
            if(n % 2 != 0){
                if(i % 2 == 0){
//                    if(isGood(i)){
//                        count+=1;
//                    }
                }
            }
        }
        return count;
    }
}
