class Solution {
    public int largestRectangleArea(int[] heights) {
        ArrayDeque<Integer> s1 = new ArrayDeque<Integer>() ;
        ArrayDeque<Integer> s2 = new ArrayDeque<Integer>() ;

        int[] l = new int[heights.length] ;
        int[] r = new int[heights.length] ;

        for(int i = 0; i < heights.length; i++) {
            int num = heights[i] ;
            while(!s1.isEmpty() && heights[s1.peek()] > num) {
                s1.pop() ;
            }
            if(s1.isEmpty()) {
                l[i] = -1 ;
            } else {
                l[i] = s1.peek() ;
            }

            s1.push(i) ;
        }

        for(int i = heights.length - 1; i >= 0; i--) {
            int num = heights[i] ;
            while(!s2.isEmpty() && heights[s2.peek()] >= num) {
                s2.pop();
            }

            if(!s2.isEmpty() && heights[s2.peek()] >= num) {
                s2.pop(); 
            }
            if(s2.isEmpty()) {
                r[i] = heights.length ;
            } else {
                r[i] = s2.peek();
            }
            s2.push(i) ;
        }
        int ans = Integer.MIN_VALUE ;
        for(int i = 0; i < heights.length; i++) {
            ans = Math.max(ans, heights[i] * (r[i] - l[i] - 1)) ;
        }
        return ans ;
    }
}