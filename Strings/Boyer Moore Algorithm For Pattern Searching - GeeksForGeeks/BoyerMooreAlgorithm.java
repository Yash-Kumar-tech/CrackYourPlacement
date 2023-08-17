import java.util.ArrayList;
import java.util.List;

public class BoyerMooreAlgorithm {

    private static int d = 256 ;
    public static void main(String[] args) {
        char[] txt = "AABAACAADAABAABA".toCharArray() ;
        char[] pat = "AABA".toCharArray() ;
        List<Integer> indices = search(txt, pat) ;
        System.out.print(new String(pat) + " found in " + new String(txt) + " at indices: ") ;
        for(int index: indices) {
            System.out.print(index + " ") ;
        }
    }
    private static List<Integer> search(char[] txt, char[] pat) {
        int m = pat.length, n = txt.length ;
        List<Integer> ans = new ArrayList<>() ;
        int[] badChar = new int[d] ;
        badCharHeuristic(pat, m, badChar);
        int s = 0; 
        while(s <= (n - m)) {
            int j = m - 1 ;
            while(j >= 0 && pat[j] == txt[s + j]) {
                j-- ;
            }
            if(j < 0) {
                ans.add(s) ;
                s += (s + m < n) ? m - badChar[txt[s + m]] : 1 ;
            } else {
                s += Math.max(1, j - badChar[txt[s + j]]) ;
            }
        }
        return ans ;
    }

    private static void badCharHeuristic(char[] s, int sz, int[] badChar) {
        for(int i = 0; i < d; i++) {
            badChar[i] = -1 ;
        }

        for(int i = 0; i < sz; i++) {
            badChar[(int) s[i]] = i ;
        }
    }
}
