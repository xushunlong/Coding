package 滑动窗口问题;

/*
 * 209.长度最小的子数组：https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 * */
public class minSubArrayLen {


    public static void main(String[] args) {
        int nums[] = {2,3,1,2,4,3};
        int target = 7;
        minSubArrayLen(target,nums);

    }
    public static int minSubArrayLen(int target, int nums[]) {
        int sum = 0, l = 0, r = 0, winSize = 0;
        while (r < nums.length) {
            sum += nums[r];
            winSize += 1;
            if (target == sum) {
                if (r - l + 1 < winSize)
                    winSize = r - l + 1;
                l++;
                r = l;
                sum = 0;
            } else {
                r++;
            }
        }

        return winSize > nums.length ? 0 : winSize;
    }

}
