class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefixSum = 0, res = 0 ;
        int[] remainders = new int[k] ;
        Arrays.fill(remainders, 0) ;
        remainders[0] = 1 ;
        for(int n: nums) {
            prefixSum = (prefixSum + n % k + k) % k ;
            res += remainders[prefixSum] ;
            remainders[prefixSum]++ ;
        }
        return res ;
    }
}