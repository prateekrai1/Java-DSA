package LeetcodeEasy;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(30));
    }
    public static boolean powerOfTwo(int n){
        if(n <= 2){
            return n==2;
        }
        if(n%2!=0){
            return false;
        }
       return powerOfTwo(n/2);
    }
}
