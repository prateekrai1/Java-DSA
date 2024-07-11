package Recursion;


//reversing and plaindrome
public class ReverseNumber {
    public static void main(String[] args) {
        boolean ans = isPalin(313);
        System.out.println(ans);
    }
    static int rev(int num){
        int digits = (int)(Math.log10(num)) + 1;
        return next(num,digits);
    }

    static int next(int num,int digits){
        if(num==0){
            return 0;
        }
        int rem = num % 10;
        return rem * (int)(Math.pow(10,digits-1)) + next(num/10,digits-1);
    }
    static boolean isPalin(int n){
        return (n==rev(n));
    }
}
