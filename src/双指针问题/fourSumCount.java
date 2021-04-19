package 双指针问题;

import java.util.HashMap;

public class fourSumCount {
    /*
     * 454. 四数相加 II:https://leetcode-cn.com/problems/4sum-ii/
     * */
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum1 = nums1[i] + nums2[j];
                map.put(sum1, map.getOrDefault(sum1, 0) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int tmp = -(nums3[i] + nums4[j]);
                res += map.getOrDefault(tmp, 0);
            }
        }
        return res;
    }
}
