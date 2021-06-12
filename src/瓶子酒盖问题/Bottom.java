package 瓶子酒盖问题;

public class Bottom {

    /*
     * 2个瓶子换1瓶酒
     * 4个瓶盖换1瓶酒
     * @param 已有酒数量
     */
    public static int getBottom(int initBottom) {
        int bottom = initBottom;
        int cap = initBottom;
        int sum = initBottom;

        while (bottom / 2 > 0 || cap / 4 > 0) {
            int tmpSum = cap + bottom;
            bottom = tmpSum / 2;
            cap = tmpSum / 4;
            sum += tmpSum;

        }
        return sum;
    }
}
