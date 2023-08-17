class Solution {
    public int numDistinct(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len2 >= len1) {
            return s.equals(t) ? 1 : 0;
        }
        int[][] memo = new int[len1+1][len2+1];
        for(int i = 0; i <= len2; i++) {
            memo[0][i] = 0 ;
        }
        for(int i = 0; i <= len1; i++) {
            memo[i][0] = 1 ;
        }
        for(int i = 1; i <= len1; i++) {
            for(int j = 1; j <= len2; j++) {
                if(s.charAt(i - 1) == t.charAt(j - 1)) {
                    memo[i][j] = memo[i-1][j-1]+memo[i-1][j] ;
                } else {
                    memo[i][j] = memo[i-1][j] ;
                }
            }
        }
        return memo[len1][len2];
    }
}