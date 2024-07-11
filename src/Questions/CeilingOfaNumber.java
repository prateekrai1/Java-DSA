package Questions;

public class CeilingOfaNumber {
    //ceiling number is smallest element in the array greater than or = target
    public static void main (String [] args){
        int [] arr = {1,4,5,14,16,18,19,22};
        int target = 19;
        int ans = ceilingNumber(arr,target);
        System.out.println(ans);
    }
    static int ceilingNumber (int[]arr, int tgt){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(tgt < arr[mid]){
                end = mid-1;
            }
            else if (tgt > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
