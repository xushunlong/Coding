package 滑动窗口问题;

/*
 * 209.长度最小的子数组：https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 * */
public class minSubArrayLen {
<<<<<<< HEAD
    public static int minSubArrayLen(int target, int nums[]) {
        int sum = 0, l = 0, r = 0, winSize = Integer.MAX_VALUE;
        while (r < nums.length) {
            sum += nums[r];
            if (sum >= target) {
=======
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
>>>>>>> 238c08ed9291f0bbc1820dd4b210d5c9350e1e9b
                if (r - l + 1 < winSize)
                    winSize = r - l + 1;
                l++;
                r = l;
<<<<<<< HEAD
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

=======
            }
            r++;
        }
        System.out.println(winSize);
        return 0;
>>>>>>> 238c08ed9291f0bbc1820dd4b210d5c9350e1e9b
    }
}
