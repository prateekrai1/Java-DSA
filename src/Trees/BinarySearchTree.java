package Trees;

import java.sql.SQLSyntaxErrorException;

public class BinarySearchTree {
    private class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public int getvalue(){
            return value;
        }
    }

    private Node root;

    public BinarySearchTree(){

    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void display(){
        display(root, "Root Node: ");
    }

    private void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.getvalue());
        display(node.left,"left child of " + node.getvalue());
        display(node.right, "right child of " + node.getvalue());
    }
}
