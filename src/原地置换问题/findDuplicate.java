package 原地置换问题;

public class findDuplicate {
    /*
     * 287. 寻找重复数:https://leetcode-cn.com/problems/find-the-duplicate-number/
     * */
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
