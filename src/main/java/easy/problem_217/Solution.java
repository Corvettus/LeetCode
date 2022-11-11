package easy.problem_217;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> metNumbers = new HashSet<>();

        for (int n : nums) {
            if (metNumbers.contains(n)) {
                return true;
            }
            metNumbers.add(n);
        }

        return false;
    }
}