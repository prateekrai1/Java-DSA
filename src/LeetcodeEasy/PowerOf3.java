package LeetcodeEasy;

public class PowerOf3 {
    public static void main(String[] args) {
        System.out.println(powerOfthree(30));
    }
    public static boolean powerOfthree(int n){
        if(n == 1){
            return true;
        }
        if(n%2 ==0){
            return false;
        }
        return powerOfthree(n/3);
    }
}
