package 树相关问题;

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
    /**
     * (isSymmetric)101. 对称二叉树:https://leetcode-cn.com/problems/symmetric-tree/
     * @param root
     * @return
     */
    public boolean isSymmetric2(TreeNode root) {
        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val != right.val)
            return false;
        return dfs(left.left, right.right) && dfs(left.right, right.left);
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
