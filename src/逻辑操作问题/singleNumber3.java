package 逻辑操作问题;

public class singleNumber3 {
    /*
     * 260. 只出现一次的数字 III:https://leetcode-cn.com/problems/single-number-iii/
     * */

    public int[] singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums)
            res ^= num;
        int mask = 0;
        while ((mask & res) == 0) {
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
