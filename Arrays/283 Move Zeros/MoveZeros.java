class Solution {
    public void moveZeroes(int[] nums) {
        int len = 0, i = 0;
        while(i < nums.length) {
            if(nums[i] == 0) {
                i++ ;
            } else {
                nums[len++] = nums[i++] ;
            }
        }
        while(len < nums.length) {
            nums[len++] = 0 ;
        }
    }
}