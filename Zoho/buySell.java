class Solution {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        int maxProfit = 0, minPrice = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++) {
            if(minPrice > prices[i]) {
                minPrice = prices[i];
            }else if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}