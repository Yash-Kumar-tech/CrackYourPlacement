class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1) ;
        int pSum = 0, count = 0 ;
        for(int i = 0; i < nums.length; i++) {
            pSum += nums[i] ;
            int rem = pSum - k ;
            count += prefixSum.getOrDefault(rem, 0) ;
            prefixSum.put(pSum, prefixSum.getOrDefault(pSum, 0) + 1) ;
        }
        return count;
    }
}