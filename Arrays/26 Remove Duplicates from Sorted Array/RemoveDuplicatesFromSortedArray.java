class Solution {
    public int removeDuplicates(int[] nums) {
        int currVal = nums[0], len = 1; 
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == currVal) {
                continue ;
            } else {
                currVal = nums[i]; 
                nums[len++] = nums[i] ;
            }
        }
        return len ;
    }
}