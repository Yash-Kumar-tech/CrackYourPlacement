class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int windowSize = cardPoints.length - k ;
        int arrSum = 0, windowSum = 0 ;
        for(int i = 0; i < cardPoints.length; i++) {
            if(i < windowSize) {
                windowSum += cardPoints[i] ;
            }
            arrSum += cardPoints[i] ;
        }
        int ans = arrSum - windowSum ;
        for(int i = windowSize; i < cardPoints.length; i++) {
            windowSum += cardPoints[i] - cardPoints[i - windowSize] ;
            ans = Math.max(ans, arrSum - windowSum);
        }
        return ans ;
    }
}