package Recursion;


//count number of zeros
public class CountNumberOfZeros {
    public static void main(String[] args) {
        int zeros=count(1000000065);
        System.out.println(zeros);
    }
    static int count(int n){
        return next(n,0);
    }
    static int next(int n,int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return next(n/10,c+1);
        }
        return next(n/10,c);
    }
}
