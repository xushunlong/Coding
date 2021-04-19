package 简单问题;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    /*
     * 169. 多数元素:https://leetcode-cn.com/problems/majority-element/
     * */
    public int majorityElement(int[] nums) {
        int res = nums[0], count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == res)
                count++;
            else {
                res = count > 0 ? res : nums[i];
                count = count > 0 ? --count : 0;
            }
        }
        return res;
    }

    public int majorityElement2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 2)
                return num;
        }
        return -1;
    }

//    public int majorityElement2(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//            if (map.get(num) > nums.length / 2)
//                return num;
//        }
//        return 0;
//    }
}
