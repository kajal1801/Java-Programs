public class MaxProfit {
    public int maxProfit(int[] prices) {
        int profit = 0, min = Integer.MAX_VALUE;
        for(int i = 0;i<prices.length;i++){
            min = Math.min(prices[i],min);
            if(profit < (prices[i] - min)){
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}
