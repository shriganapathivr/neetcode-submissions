class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            min = Math.min(price, min);
            maxProfit = Math.max(price - min, maxProfit);
        }
        return maxProfit;
    }
}
