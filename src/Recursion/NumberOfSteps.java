package Recursion;


//Count number of steps to make the number zero
public class NumberOfSteps {
    public static void main(String[] args) {
        int ans = count(41);
        System.out.println(ans);
    }

    static int count(int n){
        return next(n,0);
    }
    static int next(int n,int c){
        if(n == 0){
            return c;
        }
        if(n%2 == 0){
            return next(n/2,c+1);
        }
        return next(n-1,c+1);
    }
}
