package 简单问题;

import java.util.Map;

class LRUCache {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    private int capacity;
    private Map<Integer, ListNode> map;
    private ListNode head;
    private ListNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new ListNode(-1);
        tail = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        ListNode pre = map.get(key);
        ListNode cur = pre.next;
        if(cur.next != tail){
            map.put(cur.next.val,pre);
            pre.next = cur.next;
            map.put(key,tail);
        }
        tail.next = cur;
        tail = cur;
        return cur.val;
    }

    public void put(int key, int value) {
        if (get(key) != -1) {
            map.get(key).next.val = value;
        }
        ListNode newNode = new ListNode(value);

        map.put(value, tail);
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        if (map.size() > capacity) {
            map.remove(head.next.val);
            map.put(head.next.next.val, head);
            head.next = head.next.next;

        }


    }
}

/**
 * Your tmp.LRUCache object will be instantiated and called as such:
 * tmp.LRUCache obj = new tmp.LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */