package GeeksForGeeks;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {3,5,-10,17,21,33,-34,59};
        maxmin(arr,1,arr[0],arr[0]);
    }
    public static void maxmin(int[] arr, int index, int max, int min){
        if(index == arr.length ){
            System.out.println("Min = " + min + " Max = " + max);
            return;
        }
        if(arr[index]< min){
            min = arr[index];
        }
        if(arr[index] > max){
            max = arr[index];
        }
        index++;
        maxmin(arr, index, max, min);
    }
}
