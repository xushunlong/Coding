package 树相关问题.路径和;

import 树相关问题.TreeNode;

public class hasPathSum {
    /**
     * 112. 路径总和：https://leetcode-cn.com/problems/path-sum/
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        targetSum -= root.val;
        if (root.right == null && root.left == null) {
            return targetSum == 0;
        }
        return hasPathSum(root.right, targetSum) || hasPathSum(root.left, targetSum);
    }

}
