package 链表问题;

public class revertList {
    public static void main(String[] args) {

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
