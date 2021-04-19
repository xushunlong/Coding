package 大数问题;

public class isPalindrome {
    /*
     * 9. 回文数:https://leetcode-cn.com/problems/palindrome-number/
     * */
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int revert = 0, r = x;
        while (r != 0) {
            int pop = r % 10;
            r = r / 10;
            int tmp = revert;
            revert = revert * 10 + pop;
            if (tmp != revert/10)
                return false;
        }
        return revert == x ? true : false;
    }

    public static void main(String[] args) {
        int input = 123;
        System.out.println(isPalindrome(input));
    }
}
