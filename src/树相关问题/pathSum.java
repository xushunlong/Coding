package 树相关问题;

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
}
