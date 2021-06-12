package 树相关问题.路径和;

import 树相关问题.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class pathSum {
    /*
     * (pathSum)剑指 Offer 34. 二叉树中和为某一值的路径:https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/
     * */
    LinkedList<List<Integer>> res = new LinkedList<>();
    Deque<Integer> stack = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        recur(root, target);
        return res;
    }

    public void recur(TreeNode node, int sum) {
        if (node == null)
            return;
        stack.add(node.val);
        sum -= node.val;
        if (sum == 0 && node.right == null && node.left == null)
            res.add(new LinkedList(stack));
        recur(node.left, sum);
        recur(node.right, sum);
        stack.removeLast();
    }

    /**
     * 113. 路径总和 II:https://leetcode-cn.com/problems/path-sum-ii/
     */
    public List<List<Integer>> pathSum2(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return res;
    }

    public void dfs(TreeNode root, int sum) {
        if (root == null)
            return;
        sum -= root.val;
        stack.add(root.val);
        if (root.right == null && root.left == null && sum == 0) {
                res.add(new LinkedList<>(stack));
        }
        dfs(root.left, sum);
        dfs(root.right, sum);
        stack.removeLast();
    }

}
