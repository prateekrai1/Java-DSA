package Trees;

public class SegmentTrees {

    public static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    Node root;

    public SegmentTrees(int[] arr){
        //create a tree using this array
        this.root = constructTree(arr, 0, arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if(start == end){
            //leaf node
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }
        //create a new node with the index we are at
        Node node = new Node(start, end);
        int mid = (start + end)/2;

        //recursive tree
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr,mid+1, end);
        //data for each node
        node.data = node.left.data + node.right.data;
        return node;
    }

    //Query function to return a query
    public int query(int qsi, int qei){
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if(node.startInterval >= qsi && node.endInterval <= qei){
            //node is completely lying inside the query
            return node.data;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            return 0;
        }
        else {
            return this.query(node.left, qsi, qei) + this.query(node.right,qsi,qei);
        }
    }

    public void update(int index, int value){
        root.data = update(root,index,value);
    }
    //update function to update a value in the tree / leaf node
    private int update(Node node,int index, int value){
        if(index >= node.startInterval && index <= node.endInterval){
            if(index == node.startInterval && index == node.endInterval){
                node.data = value;
                return node.data;
            }
            else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right,index,value);

                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
