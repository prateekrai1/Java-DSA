package LinkedList;

public class DoublyLL {

     private Node head;
     private int size;

     public void insertFirst(int val){
         Node node = new Node(val);
         node.next = head;
         node.prev = null;
         if(head != null){
             head.prev = node;
         }
         head = node;
         size+=1;
     }

     public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        if(head == null){
            node.prev = null;
            head = node;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        size+=1;
     }

     public void display(){
         Node temp = head;
         while (temp != null){
             System.out.print(temp.val + " -> ");
             temp = temp.next;
         }
         System.out.println("END");
         System.out.println(head.val);
         System.out.println(size);
     }
     private class Node{
     private int val;
     private Node prev;
     private Node next;

     private Node(int val){
         this.val = val;
     }
     private Node(int val, Node prev, Node next){
        this.val = val;
        this.prev = prev;
        this.next = next;
     }

     }
}
