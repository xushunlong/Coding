package 链表问题;

public class mergeTwoLists {

    /*
     * 21. 合并两个有序链表:https://leetcode-cn.com/problems/merge-two-sorted-lists/
     * */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode cur = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            } else {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }
        }
        if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2;
        }
        return dummyHead.next;
    }
}
