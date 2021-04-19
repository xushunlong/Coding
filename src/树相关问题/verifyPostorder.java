package 树相关问题;

public class verifyPostorder {
    /*
     * (verifyPostorder)剑指 Offer 33. 二叉搜索树的后序遍历序列:https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/
     * */
    public boolean verifyPostorder(int[] postorder) {
        return helper(postorder, 0, postorder.length - 1);
    }

    public boolean helper(int[] postorder, int left, int right) {
        if (left >= right)
            return true;
        int root = postorder[right];
        int mid = left;
        while (postorder[mid] < root)
            mid++;
        int temp = mid;
        while (temp < right) {
            if (postorder[temp] < root)
                return false;
        }
        return helper(postorder, left, mid - 1) && helper(postorder, mid, right - 1);
    }
}
