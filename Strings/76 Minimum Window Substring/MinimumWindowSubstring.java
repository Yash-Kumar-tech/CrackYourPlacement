class Solution {
    public String minWindow(String s, String t) {
        int sLen = s.length() ;
        int tLen = t.length() ;
        if(sLen < tLen)  return "" ;
        int[] freq = new int['z'+1] ; Arrays.fill(freq, 0) ;
        int l = 0, r = 0, minLen = Integer.MAX_VALUE, sIndex = 0 ;
        for(char ch: t.toCharArray()) {
            freq[ch]++ ;
        }
        char[] sArr = s.toCharArray();;
        while(r < sArr.length) {
            if(freq[sArr[r++]]-- > 0) {
                tLen-- ;
            }
            while(tLen == 0) {
                if(r - l < minLen) {
                    sIndex = l ;
                    minLen = r - l ;
                }
                if(freq[sArr[l++]]++ == 0) {
                    tLen++;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : new String(sArr, sIndex, minLen);
    }
}