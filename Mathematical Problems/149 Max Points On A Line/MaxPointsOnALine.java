class Solution {
    public int maxPoints(int[][] points) {
        int numPoints = points.length ;
        if(numPoints <= 2)  return numPoints ;
        int ans = 2 ;
        for(int i = 0; i < numPoints; i++) {
            for(int j = i + 1; j < numPoints; j++) {
                int tot = 2 ;
                for(int k = j + 1; k < numPoints; k++) {
                    int LHS = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]) ;
                    int RHS = (points[k][0] - points[i][0]) * (points[j][1] - points[i][1]) ;
                    if(LHS == RHS) {
                        tot++ ;
                    }
                    ans = Math.max(ans, tot) ;
                }
            }
        }
        return ans ;
    }
}