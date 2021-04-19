package 双指针问题;

import java.lang.reflect.Array;
import java.util.Arrays;

public class threeSumClosest {
    /*
     * 16. 最接近的三数之和:https://leetcode-cn.com/problems/3sum-closest/、
     * 优化版本，通过过滤重复元素剪枝
     * */
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int tmp = nums[i] + nums[l] + nums[r];
                res = Math.abs(tmp - target) > Math.abs(res - target) ? res : tmp;
                if (tmp > target) {
                    r--;
                    while (nums[r] == nums[r + 1] && l < r)
                        r--;
                } else if (tmp < target) {
                    l++;
                    while (nums[l] == nums[l - 1] && l < r) {
                        l++;
                    }
                } else
                    return tmp;
            }
            while ((i < nums.length - 2) && nums[i] == nums[i + 1])
                i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] input = {0, 2, 1, 1, 1, 1, -3};
        System.out.println(threeSumClosest(input, 1));
    }
}
