package 双指针问题;

import java.lang.reflect.Array;
import java.util.*;

public class twoSum {
    /*
     * 1. 两数之和:https://leetcode-cn.com/problems/two-sum/
     * */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], i);
        }

        Arrays.sort(nums);
        int sum = Integer.MIN_VALUE, l = 0, r = nums.length - 1;

        while (l < r) {
            sum = nums[l] + nums[r];
            if (sum == target) {
                res[0] = l;
                res[1] = r;
                break;
            } else if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] input = {3, 2, 4};
        int target = 6;
        int[] res = twoSum2(input, target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }


    }
}
