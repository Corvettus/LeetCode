package easy.problem_448;

import java.util.LinkedList;
import java.util.List;

class Solution {
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