import java.util.regex.*;
class Solution {
    public boolean isNumber(String s) {
        s = s.toLowerCase() ;
        char ch = s.charAt(s.length() - 1) ;
        if(Character.isLetter(ch))  return false ;
        String[] parts = s.split("e", 1);
        try {
            Double d1 = Double.parseDouble(parts[0]) ;
            if(parts.length != 1) {
                Double d2 = Double.parseDouble(parts[1]) ;
            }
        } catch(Exception e) {
            return false ;
        }
        return true ;
    }
}