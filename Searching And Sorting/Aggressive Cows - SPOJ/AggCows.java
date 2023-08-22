import java.util.*;
import java.lang.*;

class AggCows
{
	static Scanner sc = new Scanner(System.in) ;
	public static void main (String[] args) throws java.lang.Exception
	{
		int T = sc.nextInt();
		while(T-- != 0) {
			int N = sc.nextInt();
			int C = sc.nextInt();
			int[] stalls = new int[N] ;
			for(int i = 0; i < N; i++) {
				stalls[i] = sc.nextInt();
			}
			Arrays.sort(stalls) ;
			int l = 1, r = stalls[N - 1] - stalls[0] ;
			while(l <= r) {
				int mid = l + (r - l) / 2;
				if(check(mid, stalls, C)) {
					l = mid + 1 ;
				} else {
					r = mid - 1 ;
				}
			}
			System.out.println(r) ;
		}
	}
	
	private static boolean check(int x, int[] arr, int C) {
		int cowsPlaced = 1, lastPos = 0 ;
		for(int i = 1; i < arr.length; i++) {
			if((arr[i] - arr[lastPos]) < x) {
				continue ;
			}
			if(++cowsPlaced == C) {
				return true ;
			}
			lastPos = i;
		}
		return false ;
	}
}