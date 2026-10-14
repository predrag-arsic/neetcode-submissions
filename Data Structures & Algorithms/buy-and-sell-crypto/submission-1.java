class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, buy = prices[0];

        for(int sell: prices){
            max = Math.max(max, sell - buy);
            buy = Math.min(buy, sell);
        }

        return max;
    }
}
