package K大的数;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class Solution0 {
    List<Integer> tmp = new ArrayList<Integer>();

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int kthLargest(TreeNode root, int k) {
        getList(root);
        return tmp.get(k-1);
    }

    public void getList(TreeNode node){
        if(node.left == null)
            return;
        if(node.left != null)
            getList(node.left);
        tmp.add(node.val);
        if(node.right != null)
            getList(node.right);
    }
}