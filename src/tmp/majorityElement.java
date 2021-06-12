package tmp;

import sun.rmi.server.InactiveGroupException;

import java.util.HashMap;

public class majorityElement {
    public int majorityElement(int[] nums) {
        int cur = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == cur)
                count++;
            else {
                if(count > 0)
                    count--;
                else{
                    count = 0;
                    cur = nums[i];
                }
            }
        }
        return cur;
    }
    public int majorityElement2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 2)
                return num;
        }
        return 0;
    }
}
