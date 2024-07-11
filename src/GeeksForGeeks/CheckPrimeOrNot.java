package GeeksForGeeks;

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        int num = 15;
        System.out.println(isPrime(11,2));
    }
    public static boolean isPrime(int num, int i){
        if(num <= 2){
            return num == 2;
        }
        if(num % i == 0){
            return false;
        }
        if(i * i > num){
            return true;
        }
        return isPrime(num,i+1);
    }
}
