class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> reqNumWithIndex = new HashMap<>();
        int[] ans = {-1, -1};
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i] ;
            int req = target - num ;
            if(reqNumWithIndex.containsKey(num)) {
                ans[0] = reqNumWithIndex.get(num) ;
                ans[1] = i ;
                return ans ;
            } else {
                reqNumWithIndex.put(req, i) ;
            }
        }
        return ans;
    }
}