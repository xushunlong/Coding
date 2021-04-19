package 简单问题;

class hammingWeight {
    /*
     * 191. 位1的个数:https://leetcode-cn.com/problems/number-of-1-bits/
     *
     * 通过判断n!=0，来达到结束循环的目的（避免传入负数，本题当作二进制来传入）
     * >>有符号右移  >>>无符号右移
     * */
    public static int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int res = hammingWeight(9);
        int test = 10;
        System.out.println(test >>> 1);
    }
}