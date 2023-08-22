class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0, h = 0, min = Integer.MAX_VALUE ;
        for(int i = 0; i < nums.length; i++) {
            l = Math.max(l, nums[i]) ;
            h += nums[i] ;
        }
        while(l <= h) {
            int mid = l + (h - l) / 2 ;
            if(reqParts(mid, k, nums)) {
                min = Math.min(min, mid) ;
                h = mid - 1 ;
            } else {
                l = mid + 1 ;
            }
        }
        return min ;
    }

    private boolean reqParts(int mid, int k, int[] arr) {
        int parts = 0, i = 0 ;
        while(i < arr.length) {
            int temp = 0 ;
            while(i < arr.length && arr[i] + temp <= mid) {
                temp += arr[i++] ;
            }
            parts++ ;
        }
        return parts <= k ;
    }
}