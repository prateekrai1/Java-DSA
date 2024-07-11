package LeetcodeMedium;

//Leetcode - 779
//https://leetcode.com/problems/k-th-symbol-in-grammar/description/
public class KthSymbolInGrammer {
    public static void main(String[] args) {
        System.out.println(kthGrammar(5,3));
    }
    public static int kthGrammar(int n, int k) {
        if (n == 1 && k == 1) {
            return 0;
        }
        int mid = (int)Math.pow(2,n-1)/2;
        if( k <= mid){
            return kthGrammar(n-1,k);
        }
        else{
            return 1-kthGrammar(n-1,k-mid);
        }
    }
}
