package 动态规划问题;

public class maxProfit {
    /*
     * 121. 买卖股票的最佳时机:https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
     * */
    public static int maxProfit2(int[] prices) {
        int[] dp = new int[prices.length];
        int maxProfit = 0;
        dp[0] = prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i] = dp[i - 1] < prices[i] ? dp[i - 1] : prices[i];
            maxProfit = maxProfit > prices[i] - dp[i - 1] ? maxProfit : prices[i] - dp[i - 1];
        }
        return maxProfit;
    }

    public static int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                res = res > prices[j] - prices[i] ? res : prices[j] - prices[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] input = {1, 2};
        System.out.println(maxProfit2(input));
    }
}
