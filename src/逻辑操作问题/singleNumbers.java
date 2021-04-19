package 逻辑操作问题;

public class singleNumbers {
    /*
    *  剑指 Offer 56 - I. 数组中数字出现的次数:https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/
    * */
    public int[] singleNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        int mask = 1;
        while ((res & mask) == 0) { //通过mask区分两个数的不同位来进行分组
            mask <<= 1;
        }
        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & mask) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
