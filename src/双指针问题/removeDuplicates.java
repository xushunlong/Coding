package 双指针问题;

public class removeDuplicates {
    /*
     * 26. 删除有序数组中的重复项:https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
     * */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums == null)
            return 0;
        int p = 0, q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                if (q - p > 1)
                    nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
