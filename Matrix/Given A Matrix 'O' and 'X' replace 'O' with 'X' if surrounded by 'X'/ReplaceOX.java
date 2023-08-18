public class ReplaceOX {

    static int r ;
    static int c;
    public static void main(String[] args) {
        char[][] mat = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'O', 'X', 'X'},
            {'X', 'X', 'O', 'O'}
        } ;
        r = mat.length ;
        c = mat[0].length ;
        replaceOX(mat) ;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ") ;
            }
            System.out.println();
        }
    }
    private static void replaceOX(char[][] mat) {
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(mat[i][j] == 'O') {
                    mat[i][j] = '-' ;
                }
            }
        }
        for(int i = 0; i < r; i++) {
            if(mat[i][0] == '-') {
                floodFillUtil(mat, i, 0, '-', 'O') ;
            }
            if(mat[i][c - 1] == '-') {
                floodFillUtil(mat, i, c - 1, '-', 'O');
            }
        }
        for(int i = 0; i < c; i++) {
            if(mat[0][i] == '-') {
                floodFillUtil(mat, 0, i, '-', 'O');
            }
            if(mat[r - 1][i] == '-') {
                floodFillUtil(mat, r - 1, i, '-', 'O');
            }
        }
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(mat[i][j] == '-')
                    mat[i][j] = 'X' ;
            }
        }
    }
    private static void floodFillUtil(char[][] mat, int i, int j, char prevV, char newV) {
        if(i < 0 || i >= r || j < 0 || j >= c)
            return ;
        if(mat[i][j] != prevV) {
            return ;
        }

        mat[i][j] = newV ;
        floodFillUtil(mat, i + 1, j, prevV, newV);
        floodFillUtil(mat, i - 1, j, prevV, newV);
        floodFillUtil(mat, i, j + 1, prevV, newV);
        floodFillUtil(mat, i, j - 1, prevV, newV);
    }
}
