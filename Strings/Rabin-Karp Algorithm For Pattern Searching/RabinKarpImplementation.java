import java.util.ArrayList;

/**
 * RabinKarpImplementation
 */
public class RabinKarpImplementation {
    public static void main(String[] args) {
        String txt = "GEEKS FOR GEEKS" ;
        String pat = "EEK" ;
        ArrayList<Integer> occurences = search(txt, pat) ;
        System.out.print(pat + " occured in " + txt + " at indices: ") ;
        for(int ind: occurences) {
            System.out.print(ind + " ") ;
        }
    }

    private static ArrayList<Integer> search(String txt, String pat) {
        int tLen = txt.length();
        int pLen = pat.length();
        int prime = 101 ;
        int i, j ;
        int tHash = 0;
        int pHash = 0;
        int h = 1 ;
        final int d = 256 ;
        ArrayList<Integer> occurences = new ArrayList<>() ;
        for(i = 0; i < pLen - 1; i++) {
            h = (h * d) % prime ;
        }

        for(i = 0; i < pLen; i++) {
            pHash = (d * pHash + pat.charAt(i)) % prime ;
            tHash = (d * tHash + txt.charAt(i)) % prime ;
        }
        for(i = 0; i <= tLen - pLen; i++) {
            if(pHash == tHash) {
                for(j = 0; j < pLen; j++) {
                    if(txt.charAt(i + j) != pat.charAt(j))
                        break ;
                }
                if(j == pLen) {
                    occurences.add(i) ;
                }
            }
            if(i < tLen - pLen) {
                tHash = (d * (tHash - txt.charAt(i) * h) + txt.charAt(i + pLen)) % prime ;
                if(tHash < 0) {
                    tHash += prime ;
                }
            }
        }
        return occurences;
    }
}