package StackAndQueues;

import java.util.Queue;

public class CustomQueue {
    private int[] data;

    private static final int DEFAULT_SIZE = 10;

    private int ptr = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Cannot insert item in Queue");
            return false;
        }
        data[ptr++] = item;
        return true;
    }

    public int delete() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot remove from empty Queue");
        }
        int removed = data[0];
        //shift elements to the left
        for(int i=1; i<ptr; i++){
            data[i-1] = data[i];
        }
        ptr--;
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception(("Cannot peek from Empty Queue"));
        }
        return data[0];
    }

    public boolean isFull(){
        return ptr == data.length; //ptr is at last index
    }
    public boolean isEmpty(){
        return ptr == 0;
    }

    public void display(){
        for(int i=0; i<data.length;i++){
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

}
