class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, (a, b) -> a.length() - b.length()) ;
        String pr = "" ;
        for(int i = 0; i < strs[0].length(); i++) {
            if(pr.length() == strs[0].length()) {
                return pr ;
            }
            pr += strs[0].charAt(pr.length()) ;
            for(String s: strs) {
                if(!s.startsWith(pr)) {
                    return pr.substring(0, pr.length() - 1) ;
                }
            }
        }
        return pr;
    }
}