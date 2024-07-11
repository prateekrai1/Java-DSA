package LeetcodeMedium;

import java.util.Enumeration;

//Leetcode - 121
//Best time to buy and sell a stock
public class MaxProfit {
    public static void main(String[] args) {
        int[] profit = {7,1,5,3,6,4};
        System.out.println(maxProfit(profit));
    }
    public static int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit = 0;

        for(int i= 1; i<prices.length;i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else if(prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }
        return profit;
    }

//    private static int min(int[] prices) {
//        int min = prices[0];
//        for(int i=0; i<prices.length; i++){
//            if(i+1<prices.length){
//                if(prices[i] < prices[i+1] && prices[i] < min){
//                   min = prices[i];
//                }//else min = prices[i+1];
//            }
//        }
//        return min;
//    }
//
//    private static int max(int[] prices) {
//        int max = prices[0];
//        for(int i=0; i<prices.length; i++){
//            if(i+1<prices.length){
//                if(prices[i] > prices[i+1] && prices[i] > max){
//                    max = prices[i];
//                }
//                //else max = prices[i+1];
//            }
//        }
//        return max;
//    }
}
