class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums) ;
        for(int i = 0; i < nums.length - 1; i++ ) {
            int l = i + 1, r = nums.length - 1 ;
            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r] ;
                if(sum == 0) {
                    ArrayList<Integer> curr = new ArrayList<>();
                    curr.add(nums[i]) ;
                    curr.add(nums[l]) ;
                    curr.add(nums[r]) ;
                    ans.add(curr) ;
                    l++ ;
                } else if(sum < 0) {
                    l++ ;
                } else {
                    r-- ;
                }
            }
        }
        List<List<Integer>> ans1 = new ArrayList<>();
        ans1.addAll(ans) ;
        return ans1 ;
    }
}