class Solution {
    public String reverseWords(String s) {
        String newString = "";
        s = s + " " ;
        String currWord = "" ;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                if(currWord.isBlank()) 
                    continue ;
                newString = currWord +" "+ newString; 
                currWord = "";
            } else {
                currWord += s.charAt(i);
            }
        }
        return newString.trim() ;
    }
}