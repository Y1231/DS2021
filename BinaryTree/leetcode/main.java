package java2021.BinaryTree.leetcode;



import java.util.ArrayList;
import java.util.List;

    public class main {
        public static ResultType buildTree(List<Character> preorder) {
            if (preorder.isEmpty()) {
                Treenode root = null;
                int used = 0;

                ResultType resultType = new ResultType();
                resultType.root = root;
                resultType.used = used;

                return resultType;
            }

            char rootVal = preorder.get(0);
            if (rootVal == '#') {
                Treenode root = null;
                int used = 1;

                ResultType resultType = new ResultType();
                resultType.root = root;
                resultType.used = used;

                return resultType;
            }

            Treenode root = new Treenode(rootVal);

            // 构建左子树 —— 使用相同的方式构建
            //将根节点除外，到最后
            ResultType leftResult = buildTree(preorder.subList(1, preorder.size()));

            // 构建右子树 —— 使用相同的方式

            ResultType rightResult = buildTree(preorder.subList(1 + leftResult.used, preorder.size()));

            root.left = leftResult.root;
            root.right = rightResult.root;

            ResultType resultType = new ResultType();
            resultType.root = root;
            resultType.used = 1 + leftResult.used + rightResult.used;
            return resultType;
        }

        public static void main(String[] args) {
            char[] p = { 'a', 'b', 'c', '#', '#', 'd', 'e', '#', 'g', '#', '#', 'f', '#', '#', '#'};
            List<Character> list = new ArrayList<>();
            for (char c : p) {
                list.add(c);
            }

            ResultType resultType = buildTree(list);
            System.out.println(resultType.root);
            System.out.println(resultType.used);
        }
    }


