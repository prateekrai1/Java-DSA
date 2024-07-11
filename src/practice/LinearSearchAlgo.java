package practice;

public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] nums= {1,5,66,78,47,36};
        int target = 6;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
    //search in the array: return the index if item found

    static boolean linearSearch2(int arr[], int target){
        if(arr.length==0){
            return false;
        }
        for(int el:arr){
            if(el==target){
                return true;
            }
        }
        return false;
    }
    static int linearSearch3(int arr[], int target){
        if(arr.length==0){
            return -1;
        }
        for(int el:arr){
            if(el==target){
                return el;
            }
        }
        return -1;
    }
    static int linearSearch(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            //check for element if it is target
            int ele = arr[i];
             if(ele == target){
                return i;
            }
        }
        return -1;
    }
}
