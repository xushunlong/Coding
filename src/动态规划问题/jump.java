package 动态规划问题;

public class jump {
    /**
     * @date: 2021/4/14
     * (jump)45. 跳跃游戏 II:https://leetcode-cn.com/problems/jump-game-ii/
     */
    public static int jump2(int[] nums) {
        int count = 0, maxIndex = 0, end = 0;
        for (int i = 0; i < nums.length; i++) {
            maxIndex = Math.max(nums[i] + i, maxIndex);
            if (end == i) {
                count++;
                end = maxIndex;
            }
        }
        return count;
    }

    public static int jump(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 0;
        int count = 0;
        int maxIndex = nums[0];
        for (int i = 0; i < nums.length; i++) {
            count++;
            if (maxIndex >= nums.length - 1) {
                return count;
            }
            int index = maxIndex > nums.length ? nums.length : maxIndex;
            for (int j = i; j <= index; j++) {
                if (nums[j] + j > maxIndex) {
                    maxIndex = nums[j] + j;
                    i = j;
                }
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        System.out.println(jump(input));
    }
}
