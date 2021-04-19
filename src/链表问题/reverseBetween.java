package 链表问题;

public class reverseBetween {
    /*
     * 92. 反转链表 II:https://leetcode-cn.com/problems/reverse-linked-list-ii/
     * */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int l = 0, r = 0;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy, fast = slow.next;
        for (int i = 0; i < left - 1; i++) {
            slow = slow.next;
            fast = fast.next;
        }
        for (int i = 0; i < right - left; i++) {
            ListNode node = fast.next;
            fast.next = fast.next.next;

            node.next = slow.next;
            slow.next = node;
        }
        return dummy.next;
    }
}
