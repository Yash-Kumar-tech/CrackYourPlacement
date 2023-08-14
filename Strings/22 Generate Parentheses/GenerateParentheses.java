class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> strings = new ArrayList<String>();
        generate(strings, 0, 0, "", n) ;
        return strings ;
    }
    public void generate(List<String> strings, int l, int r, String s, int n) {
        if(s.length() == 2 * n) {
            strings.add(s) ;
            return ;
        } 
        if(l < n) {
            generate(strings, l+1, r, s + "(", n) ;
        }
        if(r < l) {
            generate(strings, l, r + 1, s + ")", n) ;
        }
    }
}