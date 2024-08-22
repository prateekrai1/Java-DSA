package Trees;


import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
        this.right = right;
     }
    }
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> elements = new LinkedList<>();
        elements.offer(root);
        while(!elements.isEmpty()){
            int levelsize = elements.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelsize; i++) {
                TreeNode currentNode = elements.poll();
                level.add(currentNode.val);
                if(currentNode.left != null){
                    elements.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    elements.offer(currentNode.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}
