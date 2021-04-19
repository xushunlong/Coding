package 滑动窗口问题;

import sun.font.DelegatingShape;

import java.util.Map;

public class maxSubArray {
    //动态规划求解
    public static int maxSubArray3(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = max > dp[i] ? max : dp[i];
        }
        return max;
    }

    //优化解答
    public static int maxSubArray2(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int res = sum;
        for (int i = 0; i < nums.length; i++) {
            if (sum <= 0)
                sum = sum > nums[i] ? sum : nums[i];
            else
                sum += nums[i];
            res = res > sum ? res : sum;
        }
        return res;
    }

    public static int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int tmpSum = 0;
            for (int j = i; j < nums.length; j++) {
                tmpSum += nums[j];
                sum = sum > tmpSum ? sum : tmpSum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int input[] = {-1, 2, -1, 10};
        System.out.println(maxSubArray2(input));
    }
}
