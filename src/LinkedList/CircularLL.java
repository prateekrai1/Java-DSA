package LinkedList;

public class CircularLL {

    private Node head;
    private Node tail;

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            }
            while (node != head);
        }
    }


    private class Node{
        private int val;
        private Node next;

        private Node(int val){
            this.val = val;
        }
        private Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

    }
}
