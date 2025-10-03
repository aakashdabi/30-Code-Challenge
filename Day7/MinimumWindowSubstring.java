package Day5.Day7;
import java.util.*;

class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        int required = map.size(), formed = 0, l = 0, r = 0;
        Map<Character, Integer> window = new HashMap<>();
        int[] ans = {-1, 0, 0};
        while (r < s.length()) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (map.containsKey(c) && window.get(c).intValue() == map.get(c).intValue()) formed++;
            while (l <= r && formed == required) {
                c = s.charAt(l);
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1; ans[1] = l; ans[2] = r;
                }
                window.put(c, window.get(c) - 1);
                if (map.containsKey(c) && window.get(c) < map.get(c)) formed--;
                l++;
            }
            r++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}
