package 树相关问题;

public class maxPathSum {
    /**
     * 124. 二叉树中的最大路径和:https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/
     */
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root) {
        if (root == null)
            return 0;

        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right), 0);
        int curmax = left + right + root.val;
        max = Math.max(curmax, max);
        return root.val + Math.max(left, right);
    }
}
