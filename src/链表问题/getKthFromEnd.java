package 链表问题;

public class getKthFromEnd {
    /**
     * (getKthFromEnd)剑指 Offer 22. 链表中倒数第k个节点https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/submissions/
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head, slow = head;
        int count = 1;
        while (fast != null) {
            if (count >= k)
                slow = slow.next;
            fast = fast.next;
            count++;
        }
        return slow;
    }
}
