package 链表问题;

public class isPalindrome {
    /**
     * 234. 回文链表:https://leetcode-cn.com/problems/palindrome-linked-list/
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode pre = null;
        while (slow!=null){
            ListNode tmp = slow.next;
            slow.next = pre;
            pre = slow;
            slow = tmp;
        }
        while (pre != null&&head !=null) {
            if (pre.val != head.val)
                return false;
            pre = pre.next;
            head = head.next;
        }
        return true;

    }
}
