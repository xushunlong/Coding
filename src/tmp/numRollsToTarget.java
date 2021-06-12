package tmp;

public class numRollsToTarget {
    //    public static int tmp.numRollsToTarget() {
//        /*
//        * d个骰子 f个面 总和为target
//        * dp[target][d] = dp[target-1][d -1] + dp[target-2][d-1] + dp[target-f][d-1]
//        * */
//
//
//
//    }
    /*
     *
     *
     * */
    public static void main(String[] args) {
        System.out.println(numRollsToTarget(2, 6, 7));
    }

    public static int numRollsToTarget(int d, int f, int target) {
        int[][] dp = new int[d + 1][target + 1];
        for (int i = 0; i < target; i++) {
            dp[1][target] = 1;
        }
        int mod = (int) (Math.pow(10, 9) + 7);
        for (int i = 2; i <= d; i++) { //骰子总数
            for (int k = i; k <= target; k++) { //不同情况下骰子总和
                for (int j = 1; j < f * d; j++) {
                    if (j > k) {
                        dp[i][k] = (dp[i][k] + dp[i - 1][j - k]) % mod;
                    }
                }
            }
        }
        return dp[d][target] % mod;
    }

}
