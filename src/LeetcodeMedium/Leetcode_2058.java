package LeetcodeMedium;

import LinkedList.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Leetcode 2058 -  Find the minimum and maximum number of nodes between critical points
//https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/description/?envType=daily-question&envId=2024-07-05
public class Leetcode_2058 {
    public static void main(String[] args) {
        List<Integer> critical = new ArrayList<>();
        ListNode head = new ListNode(2);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(3);
//        head.next.next.next.next.next = new ListNode(2);
//        head.next.next.next.next.next.next = new ListNode(2);
//        head.next.next.next.next.next.next.next = new ListNode(2);
//        head.next.next.next.next.next.next.next.next = new ListNode(7);
        display(head);
        System.out.println(" \n" + criticalPoints(head,head,head.next.next,critical,1,3));
        int[] ans = minandmaxArray(critical);
        System.out.println(Arrays.toString(ans));
    }
    public static List<Integer> criticalPoints(ListNode head, ListNode p1,ListNode p2 ,List<Integer> critical, int i1, int i2) {
         if(p1 == head && p2 == null){
             critical.add(-1);
             critical.add(-1);
             return critical;
         }
        if(p2 == null){
            return critical;
        }
        if((p1.next.val < p1.val && p1.next.val < p2.val) || (p1.next.val > p1.val && p1.next.val > p2.val)) {
            critical.add(i1+1);
        }
        return criticalPoints(head,p1.next,p2.next,critical,i1+1,i2+1);
    }

    public static int[] minandmaxArray(List<Integer> critical){
        if(critical.isEmpty() || critical.size() == 1){
            return new int[] {-1,-1};
        }
        if(critical.get(0) == -1 && critical.get(1) == -1){
            return new int[]{-1,-1};
        }
        int min = (critical.get(critical.size() - 1)) - critical.get((critical.size() - 2));
        int max = (critical.get(critical.size() - 1)) - critical.get(0);
        return new int[]{min,max};
    }

    private static void display(ListNode head){
        for (int i = 0; i < 8; i++) {
            if( i == 6){
                System.out.print(head.val);
            }
            else {
                System.out.print(head.val + " -> ");
            }
            head = head.next;
            if(head == null){
                break;
            }
        }
    }
}
