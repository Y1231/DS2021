package java2021.BinaryTree;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int val;
    public TreeNode(int val){
        this.val=val;
    }

    @Override
    public String toString() {
        return String.format("TreeNode{%c}",val);
    }
}
