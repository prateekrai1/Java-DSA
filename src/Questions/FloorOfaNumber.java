package Questions;

public class FloorOfaNumber {
    //Floor of a number is the largest number in the array that is smaller than or = to the target element
    public static void main (String [] args){
        int[] arr = {1,4,5,6,18,29,50,67};
        int target = 17;
        int ans = floor(arr,target);
        System.out.println(ans);
    }

    static int floor(int arr[], int tgt){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(tgt < arr[mid]){
                end = mid - 1;
            }
            else if(tgt > arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
