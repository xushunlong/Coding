package 链表问题;

public class deleteDuplicates2 {
    /*
     * 82. 删除排序链表中的重复元素 II：
     * */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode dummpy = new ListNode(-1);
        dummpy.next = head;
        ListNode cur = dummpy, jup = dummpy.next;
        while (jup != null) {
            while (jup.next != null && jup.val == jup.next.val) {
                jup = jup.next;
            }
            if (cur.next == jup) {
                cur = jup;
            } else {
                cur.next = jup.next;
                jup = jup.next;
            }
        }
        return dummpy.next;
    }

    public static void main(String[] args) {
        int[] input = {1, 1, 1, 1, 2};
        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int i = 1; i < input.length; i++) {
            cur.next = new ListNode(input[i]);
            cur = cur.next;
        }
        deleteDuplicates(head);
    }
}
