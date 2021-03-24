package 滑动窗口问题;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String test = "testtt";
        System.out.println(lengthOfLongestSubstring(test));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;

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
