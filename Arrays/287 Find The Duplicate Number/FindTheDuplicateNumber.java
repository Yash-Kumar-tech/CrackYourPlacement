class Solution {
    public int findDuplicate(int[] nums) {
        int beg = 1, end = nums.length - 1;
        int dup = -1 ;
        while(beg <= end) {
            int curr = (beg + end) / 2 ;
            int count = 0 ;
            for(int n: nums) {
                if(n <= curr)
                    count++;
            }
            if(count > curr) {
                dup = curr ;
                end = curr - 1 ;
            } else {
                beg = curr + 1;
            }
        }
        return dup ;
    }
}