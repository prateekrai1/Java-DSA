package LeetcodeMedium;

import java.util.Arrays;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] ans = insert(new int[][]{{1,3},{6,9}}, new int[]{2, 5});
        System.out.println(Arrays.toString(ans));
    }

    static int[][] insert(int[][] intervals, int[] newInterval) {
        return insertedInterval(intervals,newInterval,0);
    }

    static int[][] insertedInterval(int[][] intervals, int[] newInterval, int index){
        if((index == 0) && (intervals[index][1] < intervals[index+1][0])) {
                intervals[index][0] = min(intervals[index], newInterval);
                intervals[index][1] = max(intervals[index], newInterval);
                return insertedInterval(intervals,newInterval,index+1);
        }
        else{
            if((index < intervals.length-1) && (intervals[index][1] < intervals[index+1][0])){
                    intervals[index][0] = min(intervals[index], newInterval);
                    intervals[index][1] = max(intervals[index], newInterval);
                    return insertedInterval(intervals,newInterval,index+1);
                }
            }
        return intervals;
    }

    static int min(int[] intervals, int[] newInterval){
        int min = 320000;
        for(int i=0; i<intervals.length; i++) {
            for(int j=0; j<newInterval.length; j++) {
                if (intervals[i] < newInterval[j]) {
                    min = intervals[i];
                } else {
                    min = newInterval[j];
                }
            }
        }
        return min;
    }
    static int max(int[] intervals, int[] newInterval){
        int max = -320000;
        for(int i=0; i<intervals.length; i++) {
            for(int j=0; j<newInterval.length; j++) {
                if (intervals[i] > newInterval[j]) {
                    max = intervals[i];
                } else {
                    max = newInterval[j];
                }
            }
        }
        return max;
    }
}
