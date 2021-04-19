package 树相关问题;

public class lowestCommonAncestor2 {
    /*
     * 236. 二叉树的最近公共祖先:https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
     * */

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        if (p == root || q == root)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null && right == null)
            return null;
        if (right == null)
            return left;
        if (left == null)
            return right;
        return root;
    }
}
