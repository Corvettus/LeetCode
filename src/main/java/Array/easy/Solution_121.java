package Array.easy;

public class Solution_121 {

    /**
     * 121. Best Time to Buy and Sell Stock
     *
     * You are given an array prices
     * where prices[i] is the price of a given stock on the ith day.
     *
     * You want to maximize your profit by
     * choosing a single day to buy one stock and
     * choosing a different day in the future to sell that stock.
     *
     * Return the maximum profit you can achieve from this transaction.
     * If you cannot achieve any profit, return 0.
     */
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