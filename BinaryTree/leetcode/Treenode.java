package java2021.BinaryTree.leetcode;

public class Treenode {

        public char val;
        public Treenode left;
        public Treenode right;

        public Treenode() {
        }

        public Treenode(char val) {
            this.val = val;
        }

        public Treenode(char val, Treenode left, Treenode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

}
