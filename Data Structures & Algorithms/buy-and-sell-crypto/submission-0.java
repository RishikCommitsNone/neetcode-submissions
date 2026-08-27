class Solution {
    public int maxProfit(int[] prices) {
        int left_min = prices[0];
        int max = 0;
        for(int i = 1; i < prices.length; i++){
            max = Math.max(max, prices[i] - left_min);
            left_min = Math.min(left_min, prices[i]);
        }
        return max;
    }
}
