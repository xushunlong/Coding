package 链表问题;

public class removeNthFromEnd {
    /*
    * 19. 删除链表的倒数第 N 个结点:https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
    * */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode cur = head;
        int count = 0;
        while (fast.next != null) {
            if (n <= 0) {
                cur = cur.next;
            }
            fast = fast.next;
            n--;
        }
        if(n == 1) return head.next;
        cur.next = cur.next.next;
        return head;
    }
}
