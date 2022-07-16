package easy.problem_00724;

public class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int leftSum = 0;

        for (int num : nums) {
            total += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (total - leftSum - nums[i] == leftSum)
                return i;

            leftSum += nums[i];
        }

        return -1;
    }
}
