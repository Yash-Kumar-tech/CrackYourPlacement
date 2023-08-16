class Solution {
    public int calculate(String s) {
        if(s.isEmpty()) return 0 ;
        int len = s.length() ;
        Stack<Integer> operands = new Stack<>(); 
        int curr = 0 ;
        char operator = '+' ;
        for(int i = 0; i < len; i++) {
            char currChar = s.charAt(i) ;
            if(Character.isDigit(currChar)) {
                curr = (curr * 10) + (currChar - '0') ;
            }
            if(!Character.isDigit(currChar) && !Character.isWhitespace(currChar) || i == len - 1) {
                if(operator == '-') {
                    operands.push(-1 * curr) ;
                } else if(operator == '+') {
                    operands.push(curr) ;
                } else if(operator == '*') {
                    operands.push(operands.pop() * curr) ;
                } else if(operator == '/') {
                    operands.push(operands.pop() / curr) ;
                }
                operator = currChar ;
                curr = 0 ;
            }
        }
        int res = 0 ;
        while(!operands.isEmpty()) {
            res += operands.pop();
        }
        return res ;
    }
}