class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int min = prices[0];

        int maxProfit = 0;

        int cost = 0;

        for(int i = 1 ; i < n ; i++)
        {
            cost = prices[i] - min;

            maxProfit = Math.max(cost ,maxProfit);

            min = Math.min(prices[i] ,min);
        }

        return maxProfit;
    }
}