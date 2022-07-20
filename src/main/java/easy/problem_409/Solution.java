package easy.problem_409;

import java.util.Arrays;

public class Solution {
    public int longestPalindrome(String s) {
        int longestPalindromeLength = 0;

        int[] hashTable = new int[52];
        Arrays.fill(hashTable, 0);

        for (char c : s.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                hashTable[c - 'A']++;
            }
            if ('a' <= c && c <= 'z') {
                hashTable[('Z' - 'A' + 1) + c - 'a']++;
            }
        }

        boolean oddCounter = false;

        for (int counter : hashTable) {
            oddCounter |= counter % 2 == 1;
            longestPalindromeLength += counter - counter % 2;
        }

        return longestPalindromeLength + (oddCounter ? 1 : 0);
    }
}
