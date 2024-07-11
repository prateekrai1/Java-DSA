package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class SingleLL {

    private Node head;
    private Node tail;
    private int size;
    public void insertFirst(int val){
        Node node =  new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size +=1;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
            System.out.println(temp.next.val);
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size +=1;
    }

    public void removeFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println(getHead().val);
        System.out.println(getTail().val);
    }

    public Node getHead(){
        return head;
    }
    public Node getTail(){
        return tail;
    }
    private class Node{
        private int val;
        private Node next;

        public Node (int val){
            this.val=val;
        }
        public Node(int val, Node next){
            this.val=val;
            this.next=next;
        }

    }

    //Questions
    //1 - Remove Duplicates in a sorted List - Leetcode 83
    public void removeDups(){
        Node node = head;
        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
    }

    //2 - Merge Two Sorted Lists - Leetcode 21
    public static SingleLL merge(SingleLL list1, SingleLL list2){
        Node head1 = list1.head;
        Node head2 = list2.head;
        SingleLL ans = new SingleLL();
        while (head1 != null && head2 != null){
            if(head1.val < head2.val){
                ans.insertLast(head1.val);
                head1 = head1.next;
            }
            else {
                ans.insertLast(head2.val);
                head2 = head2.next;
            }
        }

        while (head1 != null){
            ans.insertLast(head1.val);
            head1 = head1.next;
        }
        while (head2 != null){
            ans.insertLast(head2.val);
            head2 = head2.next;
        }
    return ans;
    }

    //3 - Linked List Cycle Detection - Leetcode 141
    public boolean hasCycle(Node head){
        Node fastPointer = head;
        Node slowPointer = head;
        while(fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(fastPointer == slowPointer){
                return true;
            }
        }
        return false;
    }

    //4 - Length of Cycle in LinkedList
    public int lengthOfaCycle(Node head){
        Node fast = head;
        Node slow = head;
        int length = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                Node temp = slow;
                do{
                    temp=temp.next;
                    length++;
                }
                while (temp != slow);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        SingleLL list1 = new SingleLL();
        SingleLL list2 = new SingleLL();

        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(4);

        SingleLL ans = merge(list1,list2);
        ans.display();
    }
}
