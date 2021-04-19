package 树相关问题;

import java.util.ArrayList;
import java.util.List;

public class inorderTraversal {
    /*
     * 94. 二叉树的中序遍历:https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
     * */

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderHelper(root, res);
        return res;
    }

    public TreeNode inorderHelper(TreeNode node, List<Integer> res) {
        if (node == null)
            return node;
        inorderHelper(node.left, res);
        res.add(node.val);
        inorderHelper(node.right, res);
        return null;
    }

}
