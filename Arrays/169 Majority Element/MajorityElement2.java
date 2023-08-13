//Using O(1) extra space
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums) ;
        int l = 0, r = 0 ;
        while(r < nums.length) {
            if(nums[l] == nums[r]) {
                if((r - l + 1) > (nums.length / 2)) {
                    return nums[l] ;
                }
                r++ ;
            }
            if(nums[l] != nums[r]) {
                l = r ;
            }
        }
        return nums[0] ;
    }
}