class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        int flag = 0 ;
        while(l <= r) {
            if(s.charAt(l) == s.charAt(r)) {
                l++ ;
                r-- ;
            } else {
                return check(s, l + 1, r) || check(s, l, r - 1) ;
            }
        }
        return true ;
    }

    private boolean check(String s, int l, int r) {
        while(l < r) {
            if(s.charAt(l++) != s.charAt(r--))  return false ;
        }
        return true ;
    }
}