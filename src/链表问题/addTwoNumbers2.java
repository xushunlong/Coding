package 链表问题;

import java.util.Stack;

public class addTwoNumbers2 {
    /*
     * 445. 两数相加 II:https://leetcode-cn.com/problems/add-two-numbers-ii/
     * */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while (!stack1.empty() || !stack2.empty() || carry != 0) {
            int tmp1 = stack1.empty() == true ? 0 : stack1.pop();
            int tmp2 = stack2.empty() == true ? 0 : stack2.pop();
            int sum = tmp1 + tmp2 + carry;
            carry = sum / 10;
            sum %= 10;
            ListNode node = new ListNode(sum);
            node.next = dummy.next;
            dummy.next = node;
        }
        return dummy.next;
    }
}
