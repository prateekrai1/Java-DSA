package GeeksForGeeks;

public class ArrayisSortedOrNot {
    public static void main(String[] args) {
        int[] nums = {2};
        System.out.println(isArraySorted(nums,0));
    }

    public static boolean isArraySorted(int[] arr, int index){
        if(arr.length == 1){
            return true;
        }
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] > arr[index + 1]){
            return false;
        }
       return isArraySorted(arr,++index);
    }
}
