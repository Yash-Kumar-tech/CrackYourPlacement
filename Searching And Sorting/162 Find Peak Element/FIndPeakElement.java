class Solution {
    public int findPeakElement(int[] nums) {
        int beg = 0, end = nums.length - 1;
        while(beg <= end) {
            int mid = (beg + end) / 2;
            if((mid == 0 || nums[mid - 1] < nums[mid]) && (mid == nums.length - 1 || nums[mid] > nums[mid + 1]))    return mid ;
            else if(mid > 0 && nums[mid - 1] > nums[mid])   end = mid - 1;
            else 
                beg = mid + 1;
        }
        return -1 ;
    }
}