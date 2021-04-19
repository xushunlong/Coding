package 动态规划问题;

public class canJump {
    /*
     * (canJump)55. 跳跃游戏:https://leetcode-cn.com/problems/jump-game/
     * */
    public boolean canJump(int[] nums) {
        if (nums.length == 1)
            return true;
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (pos < i) return false;
            pos = Math.max(nums[i] + i, pos);
        }
        return true;
    }
}
