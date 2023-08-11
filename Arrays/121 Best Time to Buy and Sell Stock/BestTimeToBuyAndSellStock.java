class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, purchasePrice = Integer.MAX_VALUE ;
        for(int i: prices) {
            purchasePrice = Math.min(purchasePrice, i) ;
            maxProfit = Math.max(maxProfit, i - purchasePrice) ;
        }
        return maxProfit; 
    }
}