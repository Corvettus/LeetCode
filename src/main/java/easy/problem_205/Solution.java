package easy.problem_205;

import java.util.Arrays;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int length = s.length();
        int[] map = new int[256];
        Arrays.fill(map, -1);

        for (int i = 0; i < length; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (map[sChar] != -1) {
                if (tChar != map[sChar]) {
                    return false;
                }
            } else {
                for (int c: map) {
                    if (c == tChar)
                        return false;
                }
                map[sChar] = tChar;
            }
        }

        return true;
    }
}
