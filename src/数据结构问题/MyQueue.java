package 数据结构问题;

import java.util.Stack;

public class MyQueue {

    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     *
     * 232. 用栈实现队列:https://leetcode-cn.com/problems/implement-queue-using-stacks/
     */

    /**
     * Initialize your data structure here.
     */
    Stack<Integer> stack;
    Stack<Integer> stack1;

    public MyQueue() {
        stack = new Stack<>();
        stack1 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        while (!stack.isEmpty()) {
            stack1.push(stack.pop());
        }
        int res;
        if (stack1.isEmpty())
            res = -1;
        else
            res = stack1.pop();
        while (!stack1.isEmpty()) {
            stack.push(stack1.pop());
        }
        return res;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        while (!stack.isEmpty()) {
            stack1.push(stack.pop());
        }
        int res;
        if (stack1.isEmpty())
            res = -1;
        else
            res = stack1.peek();
        while (!stack1.isEmpty()) {
            stack.push(stack1.pop());
        }
        return res;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.isEmpty();
    }
}
