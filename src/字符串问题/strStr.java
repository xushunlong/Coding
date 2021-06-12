package 字符串问题;

public class strStr {
    /*
     * (strStr)28.实现 strStr():https://leetcode-cn.com/problems/implement-strstr/
     * */
    //双指针2
    public static int strStr2(String haystack, String needle) {
        int left = 0, right = 0, index = 0;
        while (right < haystack.length() && index < needle.length()) {
            if (haystack.charAt(right) == needle.charAt(index)) {
                right++;
                index++;
            } else {
                index = 0;
                left++;
                right = left;
            }
        }
        return index == needle.length() ? needle.length() : -1;
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty() || needle.equals(""))
            return 0;
        int left = 0, right;

        while (left <= haystack.length() - needle.length()) {
            right = left;
            int index = 0;
            while (index < needle.length() && haystack.charAt(right) == needle.charAt(index)) {
                index++;
                right++;
            }
            if (index == needle.length())
                return left;
            left++;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print(strStr("hello", "ll"));
    }
}
