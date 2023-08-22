class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int min = nums[0] ;
        int max = nums[0] ;
        for(int i = 0; i < nums.length; i++) {
            int v = nums[i] ;
            min = Math.min(v, min) ; 
            max = Math.max(v, max) ; 
        }
        int diff = 1 - min ;
        int[] arr = new int[max + diff + 1] ;
        int[] res = new int[nums.length] ;
        for(int i = nums.length - 1; i >= 0; i--) {
            int v = nums[i] + diff ;
            res[i] = get(arr, v - 1) ;
            add(arr, v) ;
        }

        ArrayList<Integer> ans = new ArrayList<>(); 
        for(int i: res) {
            ans.add(i) ;
        }
        return ans ;
    }

    static int get(final int[] arr, int v) {
        int sum = 0;
        while (v > 0) {
            sum += arr[v];
            v -= v & -v;
        }
        return sum;
    }

    static void add(final int[] arr, int v) {
        while (v < arr.length) {
            arr[v]++;
            v += v & -v;
        }
    }
}