class Solution {
    private boolean[][] visited ;
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length ;
        visited = new boolean[m][n] ;
        for(boolean[] row: visited) {
            Arrays.fill(row, false) ;
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == word.charAt(0) && search(board, i, j, 0, word)) {
                    return true ;
                }
            }
        }
        return false ;
    }

    private boolean search(char[][] board, int i, int j, int ind, String word) {
        if(ind == word.length())    return true ;
        if(i < 0 || j < 0 || 
            i >= board.length || j >= board[0].length ||
            board[i][j] != word.charAt(ind) ||
            visited[i][j]
        ) {
            return false ;
        }
        visited[i][j] = true ;
        boolean ans = search(
            board, i + 1, j, ind + 1, word
        ) || search(
             board, i - 1, j, ind + 1, word
        ) || search(
             board, i, j + 1, ind + 1, word
        ) || search(
             board, i, j - 1, ind + 1, word
        );
        visited[i][j] = false ;
        return ans ;
    }
}