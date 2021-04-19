package 树相关问题;

public class maxDepth {
    /**
     * @date: 2021/4/18
     * (maxDepth)104. 二叉树的最大深度:https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
     */
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
