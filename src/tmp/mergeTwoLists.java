package tmp;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class mergeTwoLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode pre = dummyHead;
        while (l1 != null && l2 != null) {
            if(l1.val <= l2.val){
                pre.next = l1;
                pre = pre.next;
                l1 = l1.next;
            }else {
                pre.next = l2;
                pre = pre.next;
                l2 = l2.next;
            }
        }
        if(l2 != null){
            pre.next = l2;
        }
        if(l1 != null){
            pre.next = l1;
        }
        return dummyHead.next;

    }

}
