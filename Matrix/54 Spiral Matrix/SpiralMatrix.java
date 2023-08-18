class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length ;
        int t = 0, b = m - 1, l = 0, r = n - 1;
        ArrayList<Integer> res = new ArrayList<>();
        while(res.size() < m * n) {
            for(int i = l; i < r + 1; i++) {
                res.add(matrix[t][i]);
            }
            t++ ;
            for(int i = t; i < b + 1; i++) {
                res.add(matrix[i][r]);
            }
            r-- ;
            if(t <= b) {
                for(int i = r; i >l - 1; i--) {
                    res.add(matrix[b][i]);
                }
                b--;
            }
            if(l <= r) {
                for(int i = b; i > t - 1; i--) {
                    res.add(matrix[i][l]);
                }
                l++;
            }
        }
        return res ;
    }
}