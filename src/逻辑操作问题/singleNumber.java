package 逻辑操作问题;

public class singleNumber {
    /*
    * 136. 只出现一次的数字:https://leetcode-cn.com/problems/single-number/
    * */
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num :nums){
            res ^=num;
        }
        return res;
    }
}
