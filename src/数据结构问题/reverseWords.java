package 数据结构问题;

import java.util.Stack;

public class reverseWords {
    /**
     * @date: 2021/4/18
     * (reverseWords)151. 翻转字符串里的单词https://leetcode-cn.com/problems/reverse-words-in-a-string/
     */
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int left = 0, right = s.length() - 1;
        while (right >= 0) {
            StringBuilder tmp = new StringBuilder();
            while (right >= 0 && s.charAt(right) != ' ') {
                tmp.append(s.charAt(right));
                right--;
            }
            if (tmp.length() > 0) {
                sb.append(tmp.reverse());
                sb.append(" ");
                tmp.delete(0, tmp.length());
            }
            while (right >= 0 && s.charAt(right) == ' ')
                right--;
        }

        return sb.substring(0, sb.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
}
