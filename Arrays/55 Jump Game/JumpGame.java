class Solution {
    public boolean canJump(int[] nums) {
        int currentlyAt= 0; 
        for(int i = 0 ; i < nums.length; i++) {
            if(currentlyAt < i) {
                return false ;
            }
            currentlyAt = Math.max(currentlyAt, i+nums[i]);
        }
        return true ;
    }
}