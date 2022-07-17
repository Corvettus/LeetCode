package easy.problem_392;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if (sLength > tLength) {
            return false;
        }

        int j = 0;

        for (int i = 0; i < sLength; i++) {
            char sChar = s.charAt(i);
            while (j < tLength && sChar != t.charAt(j)) {
                j++;
            }
            if (j == tLength) {
                return false;
            }
            j++;
        }

        return true;
    }
}
