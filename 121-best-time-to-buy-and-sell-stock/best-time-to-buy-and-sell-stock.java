class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxiProfit = 0;

        for(int i =0; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxiProfit = Math.max(maxiProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxiProfit;
    }
}