package java2021.BinaryTree;

public class TreeTraversal {
    // preorder traversal
    public static void preorder(TreeNode root) {
        if (root == null) {
            // 根结点不存在 -> 是一棵空树
            // 对于空树的前序遍历，什么都不做
            return;
        }

        System.out.printf("%c ", root.val);
        preorder(root.left);    // root.left 承载左子树的含义
        preorder(root.right);
    }
    // inorder traversal
    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.printf("%c ", root.val);
        inorder(root.right);
    }

    // postorder traversal
    public static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.printf("%c ", root.val);
    }


//节点个数
    public static int sumcount(TreeNode root){
        if(root==null){
            return 0;
        }else {

            int rootcount = 1;
            int leftcount = sumcount(root.left);
            int rightcount = sumcount(root.right);

            return rootcount + leftcount + rightcount;
        }
    }

public static int leaf;
    //叶子节点个数
    public static int sumleaves(TreeNode root){

        leaf=0;
        preOrder2(root);

        return leaf;

    }

    public static void preOrder2(TreeNode root){
        if(root!=null){

            if(root.left==null&&root.right==null){
                leaf++;
            }
            preOrder2(root.left);
            preOrder2(root.right);
        }
    }


    public static int i;

    // 把这棵树按照前序遍历的顺序，第5个结点的值修改为 z
    public static void modify5thVal(TreeNode root) {
        if (root == null) {
            return;
        }

        // 先处理根
        i++;
        if (i == 5) {
            root.val = 'z';
        }
        modify5thVal(root.left);
        modify5thVal(root.right);
    }

    //第k层节点个数
    public static int Kthcount(int k,TreeNode root){
        if(root==null){
            return 0;
        }

        if(k==1){
            return 1;
        }

        int leftleaf=Kthcount(k-1,root.left);
        int rightleaf=Kthcount(k-1,root.right);
        return leftleaf+rightleaf;
    }


    //求二叉树高度
    public static int heightTree(TreeNode root){
        if(root==null){
            return 0;
        }else{

            int leftHeight=heightTree(root.left);
            int rightHeight=heightTree(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
    }

    public static boolean contains(TreeNode root,int e){
        if(root==null){
            return false;
        }else if(root.val==e) {
            return true;
        }else if(contains(root.left,e)){
            return true;
        }else{
            return (contains(root.right,e));
        }
    }

//判断
    public static TreeNode nodeOf(TreeNode root,int e){
        if(root==null){
            return null;
        }
        if(root.val==e){
            return root;
        }

        TreeNode r=nodeOf(root.left,e);
        if(r!=null){
            return r;
        }

        return nodeOf(root.right,e);

    }

    //判断节点在不在树中
    public static boolean containsNode(TreeNode root,TreeNode node){
        if(root==null){
            return false;
        }
        if(root==node){
            return true;
        }
        boolean r=containsNode(root.left,node);
        if(r!=false){
            return containsNode(root.left,node);
        }

        return containsNode(root.right,node);


    }

    public static void main(String[] args) {
        TreeNode root = BuildTree.buildTree1();

        i = 0;
        modify5thVal(root);



        System.out.print("前序: ");
        preorder(root);
        System.out.println();


        System.out.print("中序: ");
        inorder(root);
        System.out.println();

        System.out.print("后序: ");
        postorder(root);
        System.out.println();

        System.out.println(sumcount(root));

        System.out.println("==========");
        //System.out.println(sumleaves(root));

        System.out.println(heightTree(root));
        System.out.println(contains(root,'c'));
        System.out.println(nodeOf(root,'e'));
    }
}
