public class NumIslandsUsingDFS {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 0}
        } ;
        System.out.println("Number of islands = " + countIslands(mat)) ;
    }

    private static int countIslands(int[][] mat) {
        int r = mat.length ;
        int c = mat[0].length ;
        boolean[][] visited = new boolean[r][c] ;
        int count = 0 ;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(mat[i][j] == 1 && !visited[i][j]) {
                    DFS(mat, i, j, visited, r, c) ;
                    count++ ;
                }
            }
        }
        return count;
    }

    private static void DFS(int[][] mat, int i, int j, boolean[][] visited, int r, int c) {
        int[] numRow = {-1, -1, -1, 0, 0, 1, 1, 1} ;
        int[] numCol = {-1, 0, 1, -1, 1, -1, 0, 1} ;

        visited[i][j] = true ;

        for(int k = 0; k < 8; k++) {
            if(isSafe(mat, i + numRow[k], j + numCol[k], visited, r, c)) {
                DFS(mat, i + numRow[k], j + numCol[k], visited, r, c) ;
            }
        }
    }

    private static boolean isSafe(int[][] mat, int i, int j, boolean[][] visited, int r, int c) {
        return (i >= 0 && i < r) && (j >= 0 && j < c) && mat[i][j] == 1 && !visited[i][j] ;
    }
}
