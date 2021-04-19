package 动态规划问题;

public class longestPalindrome {
    /*
     * @date: 2021/4/13
     * (longestPalindrome)5. 最长回文子串:https://leetcode-cn.com/problems/longest-palindromic-substring/
     * */

    // a bcd i=1
    public static String longestPalindrome2(String s) {
        int len = 1;
        int startIndex = 0;
        int maxLen = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                len++;
                left--;
            }
            while (right < s.length() && s.charAt(right) == s.charAt(i)) {
                len++;
                right++;
            }
            while (left >= 0 && right < s.length() && (s.charAt(left) == s.charAt(right))) {
                len += 2;
                left--;
                right++;
            }
            if (len > maxLen) {
                maxLen = len;
                startIndex = left;
            }
            len = 1;
        }
        return s.substring(startIndex + 1, startIndex + maxLen + 1);
    }

    public static void main(String[] args) {
        String input = "baeeab";
        System.out.println(longestPalindrome2("babad"));
    }
}
