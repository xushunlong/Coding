package 基础问题;

public class exchange {
    /**
     * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面:
     */
    public static int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0)
            return nums;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            while (nums[i] % 2 == 1 && i < j) i++;
            while (nums[j] % 2 == 0 && i < j) j--;
            if (i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int in[] = {1, 2, 3, 4};
        exchange(in);
    }
}
