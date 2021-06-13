package 树相关问题;

import java.util.Deque;
import java.util.LinkedList;

public class sumNumbers {
    /**
     * 129. 求根节点到叶节点数字之和：https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/
     */

    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);

    }

    public int dfs(TreeNode root, int sum) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return sum * 10 + root.val;
        return dfs(root.left, sum * 10 + root.val) + dfs(root.right, sum * 10 + root.val);
    }
}
