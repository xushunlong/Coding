package 简单问题;

public class merge {
    /*
     * 88. 合并两个有序数组:https://leetcode-cn.com/problems/merge-sorted-array/
     * */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length-1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            nums1[i--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        while (n >=0 ){
            nums1[i--] = nums2[n--];
        }

    }

    public static void main(String[] args) {
        int[] input1 = {1,2,3,0,0,0};
        int[] input2 = {2,5,6};
        int test = 2;
        System.out.println(input1[test--]);
        merge(input1,3,input2,3 );
        for (int i = 0; i < input1.length; i++) {
            System.out.println(input1[i]);
        }

    }
}
