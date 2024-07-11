package LeetcodeMedium;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        int[] arr = {2,3,6,7};
        combinationSum(result,arr,7,0,combination);
    }
    public static void combinationSum(List<List<Integer>> result, int[] arr, int target, int index, List<Integer>combination){
        if(index == arr.length){
            if(target == 0){
                result.add(new ArrayList<>(combination));
            }
            return;
        }
        if(arr[index] <= target){
            combination.add(arr[index]);
            combinationSum(result,arr,target-arr[index],index,combination);
            combination.remove(combination.size() - 1);
        }
        combinationSum(result,arr,target,index+1,combination);
    }

}
