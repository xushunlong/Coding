package tmp;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

public class isSymmetric {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /*
     * 递归结束：节点为空
     *
     * */
    public boolean calcTree(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) return true;
        if (tree1 == null || tree2 == null || tree1.val != tree2.val) return false;
        return calcTree(tree1.left, tree2.right) & calcTree(tree1.right, tree1.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return calcTree(root.left, root.right);
    }
}
