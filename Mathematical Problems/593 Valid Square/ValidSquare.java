class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] points = {p1, p2, p3, p4} ;
        return checkPermutations(points, 0) ;
    }

    private boolean checkPermutations(int[][] points, int st) {
        if(st == 4) {
            return check(points[0], points[1], points[2], points[3]) ;
        } else {
            boolean res = false ;
            for(int i = st; i < 4; i++) {
                swap(points, st, i) ;
                res |= checkPermutations(points, st + 1) ;
                swap(points, st, i) ;
            }
            return res ;
        }
    }

    private void swap(int[][] points, int x, int y) {
        int[] tmp = points[x] ;
        points[x] = points[y] ;
        points[y] = tmp ;
    }

    private boolean check(int[] p1, int[] p2, int[] p3, int[] p4) {
        double d1 = getDist(p1, p2) ;
        double d2 = getDist(p1, p3) ;
        double d3 = getDist(p1, p4) ;
        double d4 = getDist(p2, p3) ;
        double d5 = getDist(p2, p4) ;
        double d6 = getDist(p3, p4) ;

        return d1 > 0 && d2 > 0 && d3 > 0 && d4 > 0 && d1 == d4 && d4 == d6 && d6 == d3 && d2 == d5 ;
    }

    private double getDist(int[] p1, int[] p2) {
        //Returns the square of distance of p1 and p2
        long x = (p1[0] - p2[0]) * (p1[0] - p2[0]) ;
        long y = (p1[1] - p2[1]) * (p1[1] - p2[1]) ;
        return x + y ;
    }
}