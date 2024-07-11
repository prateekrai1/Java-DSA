package GeeksForGeeks;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 5;
        System.out.println(product(num1,num2,0));
    }
    public static int product(int num1, int num2, int sum){
        if(num2 == 0){
            return sum;
        }
        sum += num1;
        return product(num1, --num2,sum);
    }
}
