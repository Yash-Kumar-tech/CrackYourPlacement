class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)   return false ;
        StringBuilder s = new StringBuilder(Integer.toString(x)) ;
        StringBuilder s1 = new StringBuilder(Integer.toString(x)) ;
        s.reverse();
        System.out.println(s + "," + s1) ;
        return s.toString().equals(s1.toString()); 
    }
}