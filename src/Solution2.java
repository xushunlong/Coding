public class Solution2 {
    public static int solution(int nums[], int target) {
        /*
         * 输入1个表示距离,一个表示中转能力
         * */
        if (nums.length == 0)
            return 0;
        int res = nums[0], count = 0;
        for (int i = 1; i < nums.length; i++) {
            int len = nums[i] + i > nums.length ? nums[i] + i : nums.length;
            for (int j = i; j < len; j++) {

            }
            int cur = nums[i];
            int tmpMax = 0;
            while (cur-- >= 0) {
                int index = cur + i;
                if (index < nums.length - 1) {
                    tmpMax = tmpMax > nums[index] ? tmpMax : nums[index];
                }
            }
            count++;
            res += tmpMax;
            if (res >= target)
                break;
        }
        return count;
    }

    public static int solution2(int nums[], int target) {
        target = nums.length;
        int i = 0, count = 0;
        while (true) {
            if (i + nums[i] >= target - 1) {
                count++;
                break;
            }
            int maxLen = -1, maxIndex = 0;
            for (int j = i + 1; j <= i + nums[i]; j++) {
                if (nums[j] > maxLen) {
                    maxLen = nums[j];
                    maxIndex = j;
                }
            }
            i = maxIndex;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] input = {2, 5, 1, 1, 1, 1};
        System.out.println(solution2(input, input.length));
    }
}
