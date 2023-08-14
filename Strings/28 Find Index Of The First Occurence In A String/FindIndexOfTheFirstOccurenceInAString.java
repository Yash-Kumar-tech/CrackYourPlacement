class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                Boolean isEqual = true ;
                for(int j = 1; j < needle.length(); j++) {
                    if(needle.charAt(j) != haystack.charAt(i+j)) {
                        isEqual = false ;
                        break ;
                    }
                }
                if(isEqual) {
                    return i;
                }
            }
        }
        return -1;
    }
}