/**
 * CheckReversalSorted
 */
public class CheckReversalSorted {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 3} ;
        System.out.println("Can array be sorted on reversal? " + checkArraySortedOnReversal(arr));
    }

    private static boolean checkArraySortedOnReversal(int[] arr) {
        int x = -1, y = -1 ;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1] && x == -1) {
                x = i ;
            }
            y = i + 1 ;
        }
        if(x != -1) {
            reverse(arr, x, y) ;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    return false ;
                }
            }
        }
        return true ;
    }

    private static void reverse(int[] arr, int x, int y) {
        while(x < y) {
            int tmp = arr[x] ;
            arr[x++] = arr[y] ;
            arr[y--] = tmp ;
        }
    }
}