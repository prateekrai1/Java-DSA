package Recursion;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,5,6,8};
        find(arr,4,0);
    }


    static boolean find(int []arr, int tgt, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == tgt || find(arr,tgt, index+1);
    }

    //index
    static int findindex(int[] arr, int tgt, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == tgt){
            return tgt;
        }
        return findindex(arr, tgt, index+1);
    }

    //findIndex from last
    static int findindexLast(int[] arr, int tgt, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == tgt){
            return tgt;
        }
        return findindex(arr,tgt,index-1);
    }


}
