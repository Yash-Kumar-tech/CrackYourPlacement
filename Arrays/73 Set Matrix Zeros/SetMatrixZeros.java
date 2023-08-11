class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length; 
        int[] rows = new int[m] ;
        int[] cols = new int[n] ;
        Arrays.fill(rows, 0) ;
        Arrays.fill(cols, 0) ;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    rows[i] = 1 ;
                    cols[j] = 1 ;
                }
            }
        }
        for(int i = 0; i < rows.length; i++) {
            if(rows[i] == 0)    continue ;
            for(int j = 0; j < n; j++)
                matrix[i][j] = 0 ;
        }
        for(int j = 0; j < cols.length; j++) {
            if(cols[j] == 0)    continue ;
            for(int i = 0; i < m; i++) {
                matrix[i][j] = 0 ;
            }
        }
    }
}