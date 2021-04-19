package 树相关问题;

public class diameterOfBinaryTree {
    /**
     * @date: 2021/4/18
     * (diameterOfBinaryTree)543. 二叉树的直径:https://leetcode-cn.com/problems/diameter-of-binary-tree/
     */
    int maxLen = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxLen;
    }

    public int depth(TreeNode root) {
        if (root == null)
            return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        maxLen = Math.max(maxLen, left + right);
        return Math.max(left, right) + 1;
    }
}
