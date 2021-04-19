package 树相关问题;

import java.util.*;

public class postorderTraversal {
    /*
     * 145. 二叉树的后序遍历:https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
     * */

    // 非递归后续遍历
    public List<Integer> preorderTraversal2(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        while (root != null || !deque.isEmpty()) {
            while (root.left != null) {
                deque.push(root);
                root = root.left;
            }
            root = deque.pop();
            if (root.right != null) {
                deque.add(root);
                root = root.right;
            } else{
                res.add(root.val);
                root = null;
            }
        }
        return res;
    }

    // 递归后续遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorderHelper(root, res);
        return res;
    }

    public TreeNode postorderHelper(TreeNode node, List<Integer> res) {
        if (node == null)
            return node;
        res.add(node.val);
        postorderHelper(node.left, res);
        postorderHelper(node.right, res);
        return null;
    }
}
