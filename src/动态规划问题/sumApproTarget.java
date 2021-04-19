package 动态规划问题;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class sumApproTarget {
    /*
     * 1755. 最接近目标值的子序列和：https://leetcode-cn.com/problems/closest-subsequence-sum/
     * 网易笔试题：给定n个整数，选出m个数的和大于目标值，并且能够满足最接近目标值(sumAppTarget())
     * */

    public static int minAbsDifference(int[] nums, int goal) {
        int len = nums.length;
        int llen = len / 2, rlen = len - llen;
        int lnums[] = new int[1 << llen];
        int rnums[] = new int[1 << rlen];

        for (int i = 1; i < (1 << llen); i++) {
            int sum = 0;
            for (int j = 0; j < llen; j++) {
                if (((1 << j) & i) == 0) continue;
                sum += nums[j];
                lnums[i] = sum;
//                lnums[i] = lnums[i - (1 << j)] + nums[j];
            }
        }
        for (int i = 1; i < (1 << rlen); i++) {
            int sum = 0;
            for (int j = 0; j < rlen; j++) {
                if (((1 << j) & i) == 0) continue;
                sum += nums[j + llen];
                rnums[i] = sum;
//                rnums[i] = rnums[i - (1 << j)] + nums[j + llen];
            }
        }
        Arrays.sort(lnums);
        Arrays.sort(rnums);
        int i = 0, j = rnums.length - 1, ret = Integer.MAX_VALUE;
        for (int num : lnums) {
            ret = Math.min(ret, Math.abs(num - goal));
        }
        for (int num : rnums) {
            ret = Math.min(ret, Math.abs(num - goal));
        }
        while (i < lnums.length && j >= 0) {
            int tmp = lnums[i] + rnums[j];
            ret = Math.min(ret, Math.abs(goal - tmp));
            if (tmp > goal) j--;
            else i++;
        }
        return ret;
    }

    public static int sumAppTarget(int[] arr, int target) {
        int len = arr.length;
        int llen = len >> 1, rlen = len - llen;
        int[] larr = new int[1 << llen];
        int[] rarr = new int[1 << rlen];
        for (int i = 0; i < (1 << llen); i++) {
            int sum = 0;
            for (int j = 0; j < llen; j++) {
                if (((i >> j) & 1) == 0)
                    continue;
                sum += arr[j];
                larr[i] = sum;
            }
        }
        for (int i = 0; i < (1 << rlen); i++) {
            int sum = 0;
            for (int j = 0; j < rlen; j++) {
                if (((i >> j) & 1) == 0)
                    continue;
                sum += arr[j + llen];
                larr[i] = sum;
            }
        }

        Arrays.sort(larr);
        Arrays.sort(rarr);
        int l = 0, r = rlen - 1, res = Integer.MAX_VALUE;
        for (int num : larr) {
            if (num <= target) continue;
            res = res - target > num - target ? num : res;
        }
        for (int num : rarr) {
            if (num <= target) continue;
            res = res - target > num - target ? num : res;
        }
        while (l < len && r >= 0) {
            int tmp = larr[l] + rarr[r];
            if (tmp <= target)
                continue;
            res = res - target > tmp - target ? tmp : res;
        }
        return res;
    }

    public static void main(String[] args) {
        int target = 6;
        int[] input = {5, -7, 3, 5};
        System.out.println(minAbsDifference(input, target));
    }
}
