package 原地置换问题;

public class findRepeatNumber {
    /*
     * 剑指 Offer 03. 数组中重复的数字:https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
     * */

    public int findRepeatNumber(int[] nums) {
        for (int num : nums) {
            int index = Math.abs(num);
            if (nums[index] >= 0)
                nums[index] *= -1;
            else if (nums[index] < 0)
                return Math.abs(num);
        }
        return 0;
    }
}
