package 滑动窗口问题;

/*
 * 209.长度最小的子数组：https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 * */
public class minSubArrayLen {
    public static int minSubArrayLen(int target, int nums[]) {
        int sum = 0, l = 0, r = 0, winSize = Integer.MAX_VALUE;
        while (r < nums.length) {
            sum += nums[r];
            if (sum >= target) {
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

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        int target = 11;
        System.out.println(minSubArrayLen(target, nums));

    }
}
