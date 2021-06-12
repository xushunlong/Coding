package tmp;

class Solution1 {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int res = hammingWeight(9);
        System.out.println(res);
    }
}