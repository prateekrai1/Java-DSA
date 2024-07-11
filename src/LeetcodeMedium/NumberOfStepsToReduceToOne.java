package LeetcodeMedium;

public class NumberOfStepsToReduceToOne {
    public static void main(String[] args) {
        String num = "1111011110000011100000110001011011110010111001010111110001";
        System.out.println((long)findSum(num));
    }

    public static int findSum(String num){
        char[] ch = num.toCharArray();
        double sum = 0;
        for(int i=0;i<ch.length;i++){
            long temp = (long)ch[i]-'0';
            sum += (temp * Math.pow(2,(ch.length-i-1)));
        }
        return numberOfSteps((int)sum);
    }

    private static int numberOfSteps(int sum) {
        int count = 0;
        if(sum <= 1){
            return count;
        }
        if(sum % 2 == 0){
            return numberOfSteps(sum/2);
        }
        else sum+=1;
        return numberOfSteps(sum);
    }

}
