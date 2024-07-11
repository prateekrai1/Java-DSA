package StackAndQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws Exception {
        // CustomStack stack = new DynamicStack();
//        CustomQueue queue = new CustomQueue(5);
//
//        queue.insert(1);
//        queue.insert(5);
//        queue.insert(14);
//        queue.insert(4);
//        queue.insert(7);
//
//        queue.display();

        CircularQueue queue = new CircularQueue(5);
        queue.insert(1);
        queue.insert(5);
        queue.insert(14);
        queue.insert(4);
        queue.insert(7);
        queue.display();
        queue.remove();
        queue.display();

        ArrayList<Integer> java = new ArrayList<>();
        List<Integer> jaa = new ArrayList<>();
    }
}
