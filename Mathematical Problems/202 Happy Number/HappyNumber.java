class Solution {
    Map<Integer, Integer> memo ;
    public boolean isHappy(int n) {
        memo = new HashMap<>();
        int s = sq(n), f = sq(sq(n)) ;
        while(s != f) {
            s = sq(s) ;
            f = sq(sq(f)) ;            
        }
        return s == 1 ;
    }

    public int sq(int n) {
        if(memo.containsKey(n)) return memo.get(n) ;
        int ans = 0 ;
        while(n > 0) {
            ans += (n % 10) * (n % 10) ;
            n /= 10 ;
        }
        memo.put(n, ans) ;
        return ans ;
    }
}