package Testing;

public class StringTest {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8,9};
       sum(arr,0,0);
    }
    public static int sum(int[] arr, int index, int sum){
        if(index >= arr.length){
            return sum;
        }
        sum(arr,index+1,sum+arr[index]);
        System.out.println(sum);
        return sum;
    }
}
