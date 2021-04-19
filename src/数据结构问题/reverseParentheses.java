package 数据结构问题;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class reverseParentheses {
    /*
     * (reverseParentheses)1190. 反转每对括号间的子串:https://leetcode-cn.com/problems/reverse-substrings-between-each-pair-of-parentheses/
     * */

    //双指针法
    public String reverseParentheses2(String s) {
        int left = 0, right = 0;
        StringBuilder sb = new StringBuilder(s);
        while (right < sb.length()) {
            while (right < sb.length() && sb.charAt(right) != ')')
                right++;
            if (right == sb.length())
                break;
            left = right;

            while (left >= 0 && sb.charAt(left) != '(')
                left--;

            String substring = sb.substring(left + 1, right);
            StringBuilder sb2 = new StringBuilder(substring);
            sb2 = sb2.reverse();
            sb.replace(left, right + 1, sb2.toString());
            right -= 2;
        }
        return sb.toString();
    }

    // 双栈法
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> buffer = new Stack<>();

        for (char cur : s.toCharArray()) {
            if (cur != ')')
                stack.push(cur);
            else {
                while (!stack.isEmpty() && stack.peek() != '(')
                    buffer.push(stack.pop());
                if (!stack.isEmpty())
                    stack.pop();
                stack.addAll(buffer);
                buffer.clear();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char cur : stack) {
            sb.append(cur);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        reverseParentheses rv = new reverseParentheses();
        System.out.println(rv.reverseParentheses2("(abcd)"));
    }
}
