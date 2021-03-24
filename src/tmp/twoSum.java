package tmp;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int[] tmp = new int[2];
        int sum = 0;
        while (i < j) {
            sum = nums[i] + nums[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {

                tmp[0] = nums[i];
                tmp[1] = nums[j];
                break;
            }
        }
        return tmp;
    }
}
