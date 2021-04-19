package 排序算法;

import java.util.Arrays;

public class getLeastNumbers {
    /*
     * 剑指 Offer 40. 最小的k个数:https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
     * */
//    public static int[] getLeastNumbers2(int[] arr, int k) {
//
//    }
//



    public static int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }
}
