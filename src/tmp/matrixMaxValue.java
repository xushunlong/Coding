package tmp;

public class matrixMaxValue {
    /*
     *  f(i,j) = max(f(i-1,j),f(i,j-1)) + grid(i,j)
     * */
    public static void main(String[] args) {
        int[][] test = {{1,3,1},{1,5,1},{4,2,1}};
        maxValue(test);
    }
    public static int maxValue(int[][] grid) {
        int[][] f = grid;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0 && j > 0) {
                    System.out.println(f[i][j - 1]);
                    f[i][j] +=  f[i][j - 1];

                    continue;
                }
                if (i > 0 && j == 0) {
                    f[i][j] +=  f[i - 1][j];
                    continue;
                }
                f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]) + f[i][j];

            }
        }
        return f[m - 1][n - 1];
    }
}
