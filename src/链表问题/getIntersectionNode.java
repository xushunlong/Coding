package 链表问题;

public class getIntersectionNode {
    /*
    * 160. 相交链表:https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
    * */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2) {
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;
        }

        return p1;
    }
}
