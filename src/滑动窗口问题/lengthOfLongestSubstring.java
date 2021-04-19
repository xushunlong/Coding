package 滑动窗口问题;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String test = "testtt";
        System.out.println(lengthOfLongestSubstring(test));
    }
<<<<<<< HEAD
    /*
    * 3. 无重复字符的最长子串:https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
    * */
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
=======

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;

>>>>>>> 238c08ed9291f0bbc1820dd4b210d5c9350e1e9b
        for (int j = 0; j < s.length(); j++) {
            for (int i = j; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), 1);
                }else
                    break;
            }
            maxLength = map.size() < maxLength ? maxLength : map.size();
            map.clear();
        }
        return maxLength;
    }
}
