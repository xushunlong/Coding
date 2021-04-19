package 简单问题;

public class search {
    /*
     * 704. 二分查找:https://leetcode-cn.com/problems/binary-search/
     * */
    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] < target)
                l = mid + 1;
            else if (nums[mid] > target)
                r = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int input[] = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(input, 9));
    }

}
