//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        int sLen = s.length(), pLen = p.length() ;
        if(sLen < pLen) return "-1" ;
        int[] freqP = new int[27] ;
        Arrays.fill(freqP, 0) ;
        for(char ch: p.toCharArray()) {
            freqP[ch - 'a']++ ;
        }
        int l = 0, r = 0, minLen = Integer.MAX_VALUE, sInd = 0 ;
        while(r < s.length()) {
            if(freqP[s.charAt(r++) - 'a']-- > 0) {
                pLen-- ;
            }
            while(pLen == 0) {
                if(r - l < minLen) {
                    sInd = l ;
                    minLen = r - l ;
                }
                if(freqP[s.charAt(l++) - 'a']++ == 0) {
                    pLen++ ;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "-1" : s.substring(sInd, sInd + minLen) ;
    }
}