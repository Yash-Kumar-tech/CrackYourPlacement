class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int len = nums.length ;
        HashMap<Integer, Integer> indices = new HashMap<>();
        for(int i = 0; i < len; i++) {
            indices.put(nums[i], i) ;
        }
        Arrays.sort(nums) ;
        boolean[] vis = new boolean[len] ;
        Arrays.fill(vis, false) ;
        int ans = 0;
        for(int i = 0; i < len; i++) {
            if(vis[i] || indices.get(nums[i]) == i) {
                continue ;
            }
            int j = i, cycSize = 0;
            while(!vis[j]) {
                vis[j] = true ;
                j = indices.get(nums[j]) ;
                cycSize++ ;
            }
            if(cycSize > 0) {
                ans += cycSize - 1 ;
            }
        }
        return ans ;
    }
}