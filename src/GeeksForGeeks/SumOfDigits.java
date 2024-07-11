package GeeksForGeeks;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 45632;
        System.out.println(sumOfDigits(num,0));
    }
    public static int sumOfDigits(int num, int sum){
//        int sum = 0;
        if(num == 0){
            return sum;
        }
        int rem = num%10;
        num = num/10;
        sum+=rem;
        return sumOfDigits(num,sum);
    }
}
