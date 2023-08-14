class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char ch: s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch) ;
            } else {
                if(st.isEmpty())    return false ;
                if((ch == ')' && st.peek() == '(') ||
                    (ch == '}' && st.peek() == '{') || 
                    (ch == ']' && st.peek() == '[')
                ) {
                    st.pop();
                } else {
                    return false ;
                }
            }
        }
        return st.isEmpty();
    }
}