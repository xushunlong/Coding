package 树相关问题;

import java.util.Arrays;

public class buildTree {
    /**
     * 105. 从前序与中序遍历序列构造二叉树：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0)
            return null;
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < preorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                int pre_left[] = Arrays.copyOfRange(preorder, 1, i + 1);
                int pre_right[] = Arrays.copyOfRange(preorder, i + 1, preorder.length);
                int in_left[] = Arrays.copyOfRange(inorder, 0, i);
                int in_right[] = Arrays.copyOfRange(inorder, i + 1, inorder.length);
                root.left = buildTree(pre_left, in_left);
                root.right = buildTree(pre_right, in_right);
                break;
            }
        }
        return root;
    }
}
