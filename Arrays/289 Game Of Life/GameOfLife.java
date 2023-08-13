class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length ;
        int[][] newBoard = new int[m][n] ;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int oCount = count1(board, m, n, i, j) ;
                if(board[i][j] == 1) {
                    if(oCount < 2)          newBoard[i][j] = 0 ;
                    else if(oCount < 4)     newBoard[i][j] = 1 ;
                    else                    newBoard[i][j] = 0 ;
                } else {
                    newBoard[i][j] = oCount == 3 ? 1 : 0 ;
                }
            }
        }
        for(int i = 0; i < m; i++) {
            board[i] = newBoard[i] ;
        }
    }
    private int count1(int[][] board, int m, int n, int i, int j) {
        int oCount = 0 ;
        for(int i1 = Math.max(i - 1, 0); i1 <= Math.min(i + 1, m - 1); i1++) {
            for(int j1 = Math.max(j - 1, 0); j1 <= Math.min(j + 1, n - 1); j1++)
                oCount += board[i1][j1] ;
        }
        oCount -= board[i][j] ;
        return oCount ;
    }
}