class Solution {
    public int reverse(int x) {
        long finNum = 0 ;
        while(x != 0) {
            finNum = finNum * 10 +  x % 10 ;
            x /= 10 ;
        }
        if(finNum > Integer.MAX_VALUE || finNum < Integer.MIN_VALUE) {
            return 0 ;
        }
        if(x < 0) {
            return (int)(-1 * finNum) ;
        }
        return (int)finNum ;
    }
}