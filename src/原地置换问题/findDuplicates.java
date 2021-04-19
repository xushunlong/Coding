package 原地置换问题;

import java.util.ArrayList;
import java.util.List;

public class findDuplicates {
    /*
     * 442. 数组中重复的数据:https://leetcode-cn.com/problems/find-all-duplicates-in-an-array
     * */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList();
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if(nums[index] > 0){
                nums[index] *= -1;
            }else
                list.add(Math.abs(num));
        }
        return list;
    }
}
