package 动态规划问题;

public class numWays {
    /*
     * 青蛙跳台阶
     * */
    public int numWays(int n) {
        if (n <= 1) return 1;
        if ( n == 2) return 2;
        return numWays(n - 1) + numWays(n - 2);
    }
}




























