package 滑动窗口问题;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class maxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        LinkedList<Integer> list = new LinkedList(); // 双端队列，只存储
        for (int i = 0; i < nums.length; i++) {
            while (!list.isEmpty() && nums[list.peekLast()] <= nums[i]) {
                list.pollLast();
            }
            list.add(i);
            if (list.peek() < i - k + 1) {
                list.poll();
            }
            if (i + 1 >= k) {
                result[i - k + 1] = nums[list.peek()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int input[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        LinkedList<Integer> test = new LinkedList<>();
        test.add(1);
        test.add(22);
        test.add(0);
        test.add(3);
        for (Integer tmp : test) {
            System.out.println(tmp);
        }
        System.out.println("=============");
        test.poll();
    }
}
