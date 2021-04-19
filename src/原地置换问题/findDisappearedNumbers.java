package 原地置换问题;

import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers {
    /*
     * 448. 找到所有数组中消失的数字:https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
     * */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] > 0)
                nums[index] *= -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                list.add(i + 1);
        }
        return list;
    }
}
