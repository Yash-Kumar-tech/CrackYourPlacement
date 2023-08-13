class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int ans = Integer.MIN_VALUE ;
        int lastValidIndex = 1 ;
        int ind = 0 ;
        while(ind < points.length) {
            if(lastValidIndex <= ind) {
                lastValidIndex = ind + 1 ;
            }
            for(int j = lastValidIndex; j < points.length; j++) {
                if(points[j][0] - points[ind][0] > k) {
                    break ;
                }
                int currVal = points[ind][1] + points[j][1] + points[j][0] - points[ind][0] ;
                if(currVal > ans) {
                    ans = currVal ;
                    lastValidIndex = j ;
                }
            }
            ind++ ;
        }
        return ans ;
    }
}