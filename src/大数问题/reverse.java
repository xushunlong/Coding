package 大数问题;

public class reverse {
    /*
     * 7. 整数反转:https://leetcode-cn.com/problems/reverse-integer/
     * */
    //每次通过res/10跟上一次进行比较来判断是否溢出，相等不溢出，不等溢出
    public static int reverse2(int x) {
        int res = 0;
        while (x != 0) {
            int pop = x % 10;
            x = (x - pop) / 10;
            int tmp = res;
            res = res * 10 + pop;
            if(res/10 != tmp)
                return 0;
        }
        return res;
    }

    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            int pop = x % 10;
            x = (x - pop) / 10;
            res = res * 10 + pop;
        }
        if (res <= Integer.MIN_VALUE || res >= Integer.MAX_VALUE)
            return 0;
        return (int) res;
    }

    public static void main(String[] args) {
        int input = 1534236469;
        System.out.println(reverse(input));
        System.out.println(reverse2(input));
    }
}
