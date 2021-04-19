package 链表问题;

public class hasCycle {
    /*
     * 141. 环形链表:https://leetcode-cn.com/problems/linked-list-cycle/
     * */
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode p1 = head, p2 = p1;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2)
                return true;
        }

        return false;
    }
}
