package 简单问题;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    /*
    * 217. 存在重复元素：https://leetcode-cn.com/problems/contains-duplicate/
    * */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
