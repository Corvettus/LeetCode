package Array.easy;

import java.util.LinkedList;
import java.util.List;

class Solution_448 {

    /**
     * 448. Find All Numbers Disappeared in an Array
     *
     * Given an array nums of n integers where nums[i] is in the range [1, n],
     * return an array of all the integers in the range [1, n] that do not appear in nums.
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {

        LinkedList<Integer> missed = new LinkedList<>();
        boolean[] map = new boolean[nums.length];

        for (int n : nums) {
            map[n - 1] = true;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!map[i]) {
                missed.add(i + 1);
            }
        }

        return missed;
    }
}