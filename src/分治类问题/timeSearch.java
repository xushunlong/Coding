package 分治类问题;

public class timeSearch {
    /*
     * 剑指 Offer 53 - I. 在排序数组中查找数字 I:https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
     * */

    public static int search(int[] nums, int target) {
        if (nums.length == 0)
            return 0;
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            if (nums[mid] > target)
                r = mid - 1;
            else if (nums[mid] <= target)
                l = mid + 1;
        }
        if (r >= 0 && nums[r] != target)
            return 0;
        int right = l;
        l = 0;
        r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            if (nums[mid] >= target)
                r = mid - 1;
            else if (nums[mid] < target)
                l = mid + 1;
        }
        int left = r;
        return right - left - 1;
    }

    public static void main(String[] args) {
        int[] input = {1};
        int target = 1;
        System.out.println(search(input, target));
    }
}
