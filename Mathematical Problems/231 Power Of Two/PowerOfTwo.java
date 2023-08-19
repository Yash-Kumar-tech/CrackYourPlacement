class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0)  return false ;
        int b2 = (int)(Math.log(n) / Math.log(2)) ;
        return n == Math.pow(2, b2) ;
    }
}