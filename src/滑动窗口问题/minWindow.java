package 滑动窗口问题;

import java.util.HashMap;
import java.util.Map;

public class minWindow {
    public static void main(String[] args) {
        String s = "A", t = "AA";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        /*
         *  s是源字符串
         *  t是目标串
         * */
        if (s == null || t == null || s.length() == 0 || t.length() == 0)
            return "";
        int need[] = new int[128];
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }
        int l = 0, r = 0, winSize = Integer.MAX_VALUE, needSize = t.length(), index = 0;
        while (r < s.length()) {
            char curChar = s.charAt(r);
            if (need[curChar] > 0) {
                needSize--; //总需求字符数--
            }
            need[curChar]--;
            if (needSize == 0) {//如果需求总数为0表示已经找到可用字符
                while (l < r && need[s.charAt(l)] < 0) {
                    need[s.charAt(l)]++;
                    l++;
                }
                if (r - l + 1 < winSize) { //如果当前的size小的话更新
                    winSize = r - l + 1;
                    index = l;
                }
                need[s.charAt(l)]++;
                needSize++;
                l++;
            }
            r++;
        }
        return winSize == Integer.MAX_VALUE ? "" : s.substring(index, index + winSize);
    }
}
