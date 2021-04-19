package 大数问题;

public class myAtoi {
    /*
     * 读入字符串并丢弃无用的前导空格
     * 检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
     * 读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
     * 将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
     * 具体来说，小于 −231 的整数应该被固定为 −231 ，大于 231 − 1 的整数应该被固定为 231 − 1 。
     * 返回整数作为最终结果。
     * 链接：https://leetcode-cn.com/problems/string-to-integer-atoi
     * */
    public static int myAtoi(String s) {
        char[] characArray = s.toCharArray();
        int len = s.length();
        //过滤空格
        int index = 0;
        while (index < len && characArray[index] == ' ')
            index++;
        //过滤全是空格的情况
        if (index == len)
            return 0;
        //判断符号
        int sign = 1;
        if (characArray[index] == '+') {
            index++;
        } else if (characArray[index] == '-') {
            index++;
            sign = -1;
        }

        //进行转换
        int res = 0, overflow = 0;
        while (index < len) {
            char cur = characArray[index];
            if (cur < '0' || cur > '9')
                break;
            int tmp = res;
            res = res * 10 + cur - '0';
            if (res / 10 != tmp) {
                overflow = 1;
                break;
            }
            index++;
        }
        if (overflow == 1 && sign == 1)
            return Integer.MAX_VALUE;
        else if (overflow == 1 && sign == -1)
            return Integer.MIN_VALUE;
        else
            return sign * res;
    }

    public static void main(String[] args) {
        String input = "  -42";
        System.out.println(myAtoi(input));
    }
}
