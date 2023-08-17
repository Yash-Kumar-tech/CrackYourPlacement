class Solution {
    private String[] ONES, TENS, THOUSANDS ;
    public String numberToWords(int num) {
        if(num == 0)    return "Zero" ;
        initialize() ;
        int i = 0 ;
        String ans = "" ;
        while(num > 0) {
            if(num % 1000 != 0) {
                ans = solve(num % 1000) + THOUSANDS[i] + " " + ans ;
            }
            num /= 1000 ;
            i++ ;
        }
        return ans.trim();
    }

    private void initialize() {
        ONES = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        TENS = new String[]{"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        THOUSANDS = new String[]{"", "Thousand", "Million", "Billion"};
    }

    private String solve(int num) {
        if(num == 0) {
            return "" ;
        } else if(num < 20) {
            return ONES[num] + " " ;
        } else if(num < 100) {
            return TENS [num / 10] + " " + solve(num % 10) ;
        } else {
            return ONES[num / 100] + " Hundred " + solve(num % 100) ;
        }
    }
}