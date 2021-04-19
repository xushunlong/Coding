package 双指针问题;

public class twoSum2 {
    /*
     * 167. 两数之和 II - 输入有序数组:https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
     * */
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        while (l < r) {
            int tmp = numbers[l] + numbers[r];
            if (tmp < target) l++;
            else if (tmp > target) r--;
            else
                break;
        }
        return new int[]{l, r};
    }
}
