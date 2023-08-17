class Solution
{
    public int solveWordWrap (int[] nums, int k)
    {
        int len = nums.length ;
        int i, j, currLen, cost = 0 ;
        int[] memo = new int[len], ans = new int[len] ;
        memo[len - 1] = 0 ;
        ans[len - 1] = len - 1 ;
        for(i = len - 2; i >= 0; i--) {
            currLen = -1 ;
            memo[i] = Integer.MAX_VALUE ;
            
            for(j = i; j < len; j++) {
                currLen += nums[j] + 1 ;
                if(currLen > k) break ;
                if(j == len - 1) {
                    cost = 0 ;
                } else {
                    cost = (k - currLen) * (k - currLen) + memo[j + 1] ;
                }
                
                if(cost < memo[i]) {
                    memo[i] = cost ;
                    ans[i] = j ;
                }
            }
        }
        return memo[0];
    }
}