package java2021.BinaryTree;

public class solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        if (!isSameTree(p.left, q.right)) {
            return false;
        }

        return isSameTree(p.right, q.left);
    }
}
