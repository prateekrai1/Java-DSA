package LeetcodeEasy;


import java.util.Stack;

//Leetcode 232 - Implement Queues Using Stack
//https://leetcode.com/problems/implement-queue-using-stacks/
public class QueuesUsingStacks {
    Stack<Integer> first = new Stack<>();
    Stack<Integer> second = new Stack<>();

    public QueuesUsingStacks() {
    }

    public void push(int x) {
        first.add(x);
    }

    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }

//    public boolean empty() {
//
//    }
}
