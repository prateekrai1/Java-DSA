package LeetcodeMedium;


//Leetcode - 122
//Buy and sell a Stock 2
public class MaxProfit2 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        // Using Greedy algorithm
        //  int buy = prices[0];
        //  int profit = 0;

        //  for(int i=1; i<prices.length; i++){
        //     if(buy < prices[i] ){
        //         profit += prices[i] - buy;
        //     }
        //     buy = prices[i];
        //  }
        //  return profit;

        int profit = 0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i+1] > prices[i]){
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }
}
