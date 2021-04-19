package 简单问题;

import java.util.Stack;

public class isValid {
    /*
     * 20. 有效的括号:https://leetcode-cn.com/problems/valid-parentheses/
     * */
    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if(!stack.isEmpty()){
                if(s.charAt(i) == ']' && stack.peek() == '[') stack.pop();
                else if(s.charAt(i) == '}' && stack.peek() == '{') stack.pop();
                else if(s.charAt(i) == ')' && stack.peek() == '(') stack.pop();
                else
                    stack.push(s.charAt(i));
            }else
                stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
    public static boolean isValid(String s) {
        while(s.contains("[]") || s.contains("{}" )||s.contains("()")){
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String input = "([])";
        System.out.println(isValid2(input));
    }
}
