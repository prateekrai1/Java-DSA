package GeeksForGeeks;

public class SumOfNnaturalNums {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(sum(num,0));
    }
    public static int sum(int num, int sum){
        if(num == 0){
            return sum;
        }
        sum+=num;
        return sum(--num,sum);
    }
}
