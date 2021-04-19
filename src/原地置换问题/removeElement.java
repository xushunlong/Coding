package 原地置换问题;

public class removeElement {
    /*
     * (removeElement)27. 移除元素:https://leetcode-cn.com/problems/remove-element/
     * */
    // 通过j来控制记录，当与值相等的时候i相等
    public int removeElement(int[] nums, int val) {
        int res = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
