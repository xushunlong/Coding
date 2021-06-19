package DFS问题;

import java.util.*;

public class subsetsWithDup {
    List<List<Integer>> res = new ArrayList<>();

    /**
     * 90. 子集 II:https://leetcode-cn.com/problems/subsets-ii/
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums.length == 0)
            return res;
        Arrays.sort(nums);
        dfs(nums, 0, new LinkedList<>());
        return res;
    }

    public void dfs(int[] nums, int depth, Deque<Integer> deque) {
        res.add(new ArrayList<>(deque));

        for (int i = depth; i < nums.length; i++) {
            if (i != depth && nums[i] == nums[i - 1])
                continue;
            deque.add(nums[i]);
            dfs(nums, i + 1, deque);
            deque.removeLast();
        }
    }
}
