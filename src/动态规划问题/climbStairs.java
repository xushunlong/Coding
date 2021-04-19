package 动态规划问题;

public class climbStairs {
    /*
     * 70. 爬楼梯：https://leetcode-cn.com/problems/climbing-stairs/
     *  f2 = f(1) + f(0) = 2
     *  f(1) = 1
     * */
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int dp[] = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
