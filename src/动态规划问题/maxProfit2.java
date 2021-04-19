package 动态规划问题;

public class maxProfit2 {
    /*
    * 122. 买卖股票的最佳时机 II:https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
    * */
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1])
                res +=prices[i] -prices[i-1];
        }
        return res;
    }
}
