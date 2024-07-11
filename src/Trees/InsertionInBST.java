package Trees;


import java.util.Scanner;

//Inserting an element in BST
public class InsertionInBST {

    public InsertionInBST(){

    }

    private class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public boolean isEmpty(){
        return root == null;
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public void populate(int value) {
       root = populate(root,value);
    }

    private Node populate(Node node, int value) {
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = populate(node.left,value);
            System.out.println("The left of " + node.value + " is : " + node.left.value);
        }
        if(value > node.value){
            node.right = populate(node.right,value);
            System.out.println("The right of " + node.value + " is : " + node.right.value);
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1;
        return node;
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.right) && isBalanced(node.left);
    }
}
