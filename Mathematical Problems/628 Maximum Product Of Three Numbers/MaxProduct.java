class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums) ;
        int len = nums.length ;
        int ans = Math.max(nums[len - 1] * nums[len - 2] * nums[len - 3], nums[0] * nums[1] * nums[len - 1]) ;
        return ans ;
    }
}