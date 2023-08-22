class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int st = 0, en = len - 1;
        while(st <= en) {
            int mid = st + (en - st) / 2 ;
            if(nums[mid] > nums[len - 1]) {
                st = mid + 1 ;
            } else {
                en = mid - 1 ;
            }
        }
        int pivot = st ;
        if(pivot == 0) {
            return find(nums, 0, len - 1, target) ;
        }
        int ans = target >= nums[0] ? find(nums, 0, pivot - 1, target) : find(nums, pivot, len - 1, target);
        return ans ;
    }

    private int find(int[] arr, int beg, int end, int target) {
        int ans = -1 ;
        while(beg <= end) {
            System.out.println(beg + ":" + end) ;
            int mid = (end + beg) / 2 ;
            if(arr[mid] == target) {
                ans = mid ;
                break ;
            } else if(arr[mid] < target) {
                beg = mid + 1 ;
            } else {
                end = mid - 1 ; 
            }
        }
        return ans ;
    }
}