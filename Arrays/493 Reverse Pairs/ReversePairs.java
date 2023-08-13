class Solution {
    public int reversePairs(int[] nums) {
        return solve(nums, 0, nums.length - 1) ;
    }

    private int solve(int[] nums, int l, int r) {
        if(l >= r) {
            return 0 ;
        }
        int mid = l + (r - l) / 2 ;
        int count = solve(nums, l, mid) + solve(nums, mid + 1, r) ;
        int[] memo = new int[r - l + 1] ;
        int i = l, j = mid + 1, k = 0 ;
        while(i <= mid && j <= r) {
            if((long)nums[i] > 2L * nums[j]) {
                count += mid - i + 1 ;
                j++ ;
            } else {
                i++ ;
            }
        }

        i = l ; j = mid + 1 ;
        while(i <= mid && j <= r) {
            if(nums[i] < nums[j]) {
                memo[k++] = nums[i++] ;
            } else {
                memo[k++] = nums[j++] ;
            }
        }

        while(i <= mid) {
            memo[k++] = nums[i++] ;
        }
        while(j <= r) {
            memo[k++] = nums[j++] ;
        }

        System.arraycopy(memo, 0, nums, l, r - l + 1) ;
        return count ;
    }
}