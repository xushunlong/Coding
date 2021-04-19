package 链表问题;

public class deleteDuplicates {
    /*
     * 83. 删除排序链表中的重复元素:https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
     * */

    public static ListNode deleteDuplicates_new(ListNode head) {
        if (head == null)
            return head;
        ListNode slow = head, fast = slow.next;
        while (fast != null) {
            if (slow.val == fast.val) {
                fast = fast.next;
            } else {
                slow.next = fast;
                slow = fast;
                fast = fast.next;
            }
        }
        slow.next = null;
        return head;
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;

        ListNode slow = head, fast = head.next;
        while (fast.next != null) {
            if (slow.val != fast.val) {
                slow.next = fast;
                slow = fast;
            }
            fast = fast.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] input = {1, 1, 1, 1, 2};
        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int i = 1; i < input.length; i++) {
            cur.next = new ListNode(input[i]);
            cur = cur.next;
        }
        deleteDuplicates(cur);
        while (head.next != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
