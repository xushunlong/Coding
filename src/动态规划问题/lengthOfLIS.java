package 动态规划问题;

import java.util.Arrays;
import java.util.Map;

public class lengthOfLIS {

    /**
     * (lengthOfLIS)300. 最长递增子序列:https://leetcode-cn.com/problems/longest-increasing-subsequence/
     */
    public int lengthOfLIS(int[] nums) {
        if (nums.length < 2) return nums.length;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }
        int res = 0;
        for (int tmp : dp) {
            res = Math.max(tmp, res);
        }
        return res;
    }
}
