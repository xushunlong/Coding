package 树相关问题;

public class lowestCommonAncestor {
    /*
     * 235. 二叉搜索树的最近公共祖先:https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
     * */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val == root.val || q.val == root.val)
            return root;
        if (p.val > root.val || q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);
        if (p.val < root.val || q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        return root;
    }
}
