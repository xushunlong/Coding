package DFS问题;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class subsets {
    /**
     * 78. 子集：https://leetcode-cn.com/problems/subsets/
     *
     * @param nums
     * @return
     */
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0)
            return res;
        dfs(nums, 0, new LinkedList<>());
        return res;
    }

    public void dfs(int[] nums, int depth, Deque<Integer> deque) {
        if (depth == nums.length) {
            res.add(new ArrayList<>(deque));
            return;
        }
        deque.add(nums[depth]);
        dfs(nums, depth + 1, deque);
        deque.removeLast();
        dfs(nums, depth + 1, deque);
    }

    public void dfs2(int[] nums, int depth, Deque<Integer> deque) {
        res.add(new LinkedList<>(deque));
        for (int i = depth; i < nums.length; i++) {
            deque.add(nums[i]);
            dfs2(nums, i + 1, deque);
            deque.removeLast();
        }
    }
}
