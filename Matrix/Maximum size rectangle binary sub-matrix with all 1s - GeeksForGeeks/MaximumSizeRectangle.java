import java.util.Stack;

/**
 * MaximumSizeRectangle
 */
public class MaximumSizeRectangle {
    public static void main(String[] args) {
        int[][] mat = {
            {0, 1, 0},
            {1, 1, 1},
            {1, 1, 1},
            {0, 1, 1},
        } ;

        System.out.println("Area of maximum size rectangle is: " + maxSizeRect(mat));
    }

    private static int maxSizeRect(int[][] mat) {
        int c = mat[0].length; 
        int r = mat.length ;
        int res = maxHist(r, c, mat[0]) ;
        for(int i = 1; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(mat[i][j] == 1) {
                    mat[i][j] += mat[i - 1][j] ;
                }
            }
            res = Math.max(res, maxHist(r, c, mat[i]));
        }
        return res;
    }

    private static int maxHist(int r, int c, int[] row) {
        Stack<Integer> res = new Stack<>() ;
        int top, maxArea = 0, area = 0, i = 0 ;
        while(i < c) {
            if(res.isEmpty() || row[res.peek()] <= row[i]) {
                res.push(i++) ;
            } else {
                top = row[res.peek()] ;
                res.pop() ;
                area = top * i ;
                if(!res.isEmpty()) {
                    area = top * (i - res.peek() - 1) ;
                }
                maxArea = Math.max(area, maxArea) ;
            }
        }
        while(!res.isEmpty()) {
            top = row[res.peek()] ;
            res.pop() ;
            area = top * i ;
            if(!res.isEmpty()) {
                area = top * (i - res.peek() - 1) ;
            }
            maxArea = Math.max(area, maxArea) ;
        }
        return maxArea;
    }
}