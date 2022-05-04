package Array.easy;

import java.util.HashSet;
import java.util.Set;

class Solution_217 {

    /**
     * 217. Contains Duplicate
     *
     * Given an integer array nums,
     * return true if any value appears at least twice in the array,
     * and return false if every element is distinct.
     */
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