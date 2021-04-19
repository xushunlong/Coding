package 逻辑操作问题;

import java.util.HashMap;
import java.util.Map;

public class singleNumber2 {
    /*
     * 剑指 Offer 56 - II. 数组中数字出现的次数 II:https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/
     * */

    public static int singleNumber2(int[] nums) {
        int[] helper = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                helper[i] += num & 1;
                num >>= 1;
            }
        }
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res |= helper[31 - i]%3;
        }
        return res;
    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1)
                return num;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] input = {2,2,3,2};
        System.out.println(singleNumber2(input));
    }
}
