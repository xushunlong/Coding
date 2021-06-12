package 链表问题;

public class Main {
    /**
     * (reverseList)206. 反转链表:https://leetcode-cn.com/problems/reverse-linked-list/
     *
     * @param head
     * @return
     */
    public static ListNode reverseList0430(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null; // 当前节点指针
        ListNode cur = head; //
        while (cur != null) {
            ListNode tmp = null;
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
