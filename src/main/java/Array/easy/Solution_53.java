package Array.easy;

public class Solution_53 {

    /**
     * 53. Maximum Subarray
     *
     * Given an integer array nums,
     * find the contiguous subarray
     * (containing at least one number)
     * which has the largest sum
     * and return its sum.
     *
     * A subarray is a contiguous part of an array.
     */
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}
