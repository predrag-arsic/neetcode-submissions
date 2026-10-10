class Solution {
    public int maxProfit(int[] prices) {
        //start max with zerp
        int max = 0;
        //min buying will always be the first el
        int minBuy = prices[0];

        for(Integer sell : prices){
            max = Math.max(max, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }

        return max;
    }
}
