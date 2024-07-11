package LeetcodeMedium;

import LinkedList.ListNode;

public class Leetcode_2181 {
    public static void main(String[] args) {
        ListNode question = new ListNode(0);
        question.next.val = 3;
        question.next.next.val = 1;
        question.next.next.next.val = 0;
    }

    public static ListNode mergeNodes(ListNode head) {
        head = head.next;
        ListNode start = head;
        while (start != null) {
            ListNode end = start;
            int sum = 0;
            while (end.val != 0) {
                sum += end.val;
                end = end.next;
            }
            start.val = sum;
            start.next = end.next;
            start = start.next;
        }
        return head;
    }
}
