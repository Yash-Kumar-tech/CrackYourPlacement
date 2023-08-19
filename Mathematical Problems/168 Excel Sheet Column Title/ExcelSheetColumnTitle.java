class Solution {
    public String convertToTitle(int columnNumber) {
        String name = "" ;
        while(columnNumber > 0) {
            columnNumber-- ;
            name = (char)((columnNumber % 26) + 'A') + name;
            columnNumber /= 26 ;
        }
        return name ;
    }
}