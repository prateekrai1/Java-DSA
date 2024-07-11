package Trees;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }

    private static class Node{
        private int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root node value: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter a node to the left of " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value for the left node " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to enter a node to the right of " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value for the right node " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }
    }

    public void display(){
        display(root,"");
    }

    public void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left ,indent + "\t");
        display(node.right ,indent + "\t");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.populate(sc);
        bt.display();
    }
}
