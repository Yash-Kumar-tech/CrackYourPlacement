class Solution {
    public String intToRoman(int num) {
        int[] vals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1} ;
        String[] rom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"} ;
        int i = 0 ;
        StringBuilder ans = new StringBuilder();
        while(num > 0) {
            if(num >= vals[i]) {
                ans.append(rom[i]) ;
                num -= vals[i] ;
            } else {
                i++ ;
            }
        }
        return ans.toString() ;
    }
}