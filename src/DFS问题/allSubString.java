package DFS问题;

import org.junit.jupiter.api.Test;

public class allSubString {
    /*
     * 输出所有子序列类的问题
     * */
    public void place(int[] array) {
        //获取数据长度 那么对应的就是二进制字节位数1存在 0不存在  假设长度为4
        //一位子序列的情况有 1000  0100  0010 0001
        //二位子序列情况有 1100  1010  1001 0110 0101 0011
        //三位子序列情况 1110 1011 1101 0111
        //四位子序列情况 1111
        //空子序列 0000
        int length = array.length;
        // 二进制的可能情况数量为1向左移动数组长度位数，为什么呢?因为总共是3位
        // 每一个存在不存在两种可能 所以就是2的4次方种情况
        int end = 1 << length;
        int mark = 0;//标记
        for (mark = 0; mark < end; mark++) { //打印出每一种情况的子序列
            for (int i = 0; i < length; i++) { //遍历都不存在就是空子集
                if (((mark >> i) & (1)) == 0)
                    continue;
                System.out.print(array[i] + ",");
            }
            System.out.println();

        }
    }

    @Test
    public void test() {
        int arr[] = {1, 2, 3};
        place(arr);
//        System.out.println(1 & 2);
    }
}
