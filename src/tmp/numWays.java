package tmp;

public class numWays {
    /*
     *
     *
     * */
    public int numWays(int n) {
        if (n <= 1) return 1;
        if ( n == 2) return 2;
        return numWays(n - 1) + numWays(n - 2);
    }
}




























