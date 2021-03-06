package 大数问题;

public class addStrings {
    /*
     * 415. 字符串相加:https://leetcode-cn.com/problems/add-strings/
     * 字符串加法、链表加法以及二进制加法模板
     * */
    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) carry += num1.charAt(i--) - '0';
            if (j >= 0) carry += num2.charAt(j--) - '0';
            sb.append(carry % 10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("1", "9"));
    }
}
