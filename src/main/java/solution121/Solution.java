package solution121;

public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int currMin = Integer.MAX_VALUE;

        for (int day : prices) {
            profit = Math.max(day - currMin, profit);
            currMin = Math.min(day, currMin);
        }

        return profit;
    }
}