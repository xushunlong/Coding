import java.util.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String costStr[] = in.nextLine().split(",");
        String row[] = in.nextLine().split(";");
        List<Integer[]> pic = new ArrayList<>();
        int cost[] = new int[costStr.length];
        for (int i = 0; i < cost.length; i++) {
            cost[i] = Integer.valueOf(costStr[i]);
        }
        for (String s : row) {
            String tmp[] = s.split(",");
            Integer tmpI[] = new Integer[tmp.length];
            for (int i = 0; i < tmpI.length; i++) {
                tmpI[i] = Integer.valueOf(tmp[i]);
            }
            pic.add(tmpI);
        }

        int res[]= new int[pic.size()];



//        Scanner in = new Scanner(System.in);
//        int maxWeight = Integer.valueOf(in.nextLine());
//        String wStr[] = in.nextLine().split(",");
//        String vStr[] = in.nextLine().split(",");
//        int w[] = new int[wStr.length];
//        int v[] = new int[vStr.length];
//        if (maxWeight == 0 || w.length == 0) {
//            System.out.println(0);
//            return;
//        }
//        for (int i = 0; i < w.length; i++) {
//            w[i] = Integer.valueOf(wStr[i]);
//        }
//        for (int i = 0; i < v.length; i++) {
//            v[i] = Integer.valueOf(vStr[i]);
//        }
//
//        int n = w.length;
//        int dp[] = new int[maxWeight + 1];
//        for (int i = 0; i < n; i++) {
//            for (int j = maxWeight; j >= w[i]; j--) {
//                if (dp[j - w[i]] + v[i] >= dp[j]) {
//                    dp[j] = dp[j - w[i]] + v[i];
//                }
//            }
//        }
//        int res = Integer.MIN_VALUE;
//        for (int i = 0; i < dp.length; i++) {
//            res = Math.max(dp[i], res);
//        }
//        System.out.println(res);
//        return;


    }
}
