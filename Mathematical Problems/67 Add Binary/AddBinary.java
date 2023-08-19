class Solution {
    public String addBinary(String a, String b) {
        String ans = "" ;
        int carry = 0 ;
        int aInd = a.length() - 1 ;
        int bInd = b.length() - 1 ;
        while(aInd >= 0 || bInd >= 0 || carry == 1) {
            if(aInd >= 0) {
                carry += a.charAt(aInd--) - '0' ;
            }
            if(bInd >= 0) {
                carry += b.charAt(bInd--) - '0' ;
            }
            ans = carry % 2 + ans ;
            carry /= 2 ;
        }
        return ans ;
    }
}