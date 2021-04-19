package 树相关问题;

import 链表问题.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preorderTraversal {
    /*
     * 144. 二叉树的前序遍历:https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
     * */

    //使用栈进行前序非递归遍历
    public List<Integer> preorderTraversal2(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
        return list;
    }


    //    递归的方法实现
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorderHelper(root, res);
        return res;
    }

    public TreeNode preorderHelper(TreeNode node, List<Integer> res) {
        if (node == null)
            return node;
        res.add(node.val);
        preorderHelper(node.left, res);
        preorderHelper(node.right, res);
        return null;
    }
}
