package java2021.BinaryTree;

public class TreeDemo {



    public static void main(String[] args) {


        TreeNode root = null;

        TreeNode a = new TreeNode('Y');
        TreeNode b = new TreeNode('F');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('B');
        TreeNode e = new TreeNode('H');

        root.left=a;
        a.left = b;
        a.right = c;
        b.left=d;
        d.left=e;


        System.out.println();
    }
}
