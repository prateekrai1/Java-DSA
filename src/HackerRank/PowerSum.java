package HackerRank;


import java.util.ArrayList;
import java.util.List;

//Power Sum - HackerRank
//https://www.hackerrank.com/challenges/the-power-sum/problem
public class PowerSum {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        powerSum(100,2,1,0,ans);
        System.out.println(ans.size());
    }

    public static void powerSum(int x, int n, int start,int sum, List<Integer> ans) {
        if(sum == x){
            ans.add(1);
            return;
        }
        if(sum > x){
            return;
        }
        for(int i = start; i*i<=x; i++){
            int val = (int)Math.pow(i,n);
            powerSum(x,n,i+1,sum+val,ans);
        }
    }
}
