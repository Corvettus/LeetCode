package easy.problem_136;

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int n : nums) {
            result ^= n;
        }

        return result;
    }
}