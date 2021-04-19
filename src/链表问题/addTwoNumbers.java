package 链表问题;

public class addTwoNumbers {
    /*
     * 2. 两数相加:https://leetcode-cn.com/problems/add-two-numbers/
     * */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x1 = l1 == null ? 0 : l1.val;
            int x2 = l2 == null ? 0 : l2.val;

            int sum = x1 + x2 + carry;
            carry = sum / 10;
            sum %= 10;
            cur.next = new ListNode(sum);
            cur = cur.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;

        }
        if (carry == 1)
            cur.next = new ListNode(carry);
        return dummy.next;
    }
}
