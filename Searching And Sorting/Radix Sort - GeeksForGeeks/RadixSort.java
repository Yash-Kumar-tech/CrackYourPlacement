import java.util.Arrays;

/**
 * RadixSort
 */
public class RadixSort {

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66} ;
        System.out.print("Unsorted Array: ") ;
        for(int i: arr) {
            System.out.print(i + " ") ;
        }
        radixSort(arr);
        System.out.print("\nSorted Array: ") ;
        for(int i: arr) {
            System.out.print(i + " ") ;
        }
    }

    private static void radixSort(int[] arr) {
        int len = arr.length;
        int max = getMax(arr, len) ;

        for(int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, len, exp) ;
        }
    }

    private static void countSort(int[] arr, int len, int exp) {
        int[] ans = new int[len];
        int[] count = new int[10] ;
        Arrays.fill(count, 0);
        int i ;
        for(i = 0; i < len; i++) {
            count[(arr[i] / exp) % 10]++ ;
        }
        
        for(i = 1; i < 10; i++) {
            count[i] += count[i - 1] ;
        }

        for(i = len - 1; i >= 0; i--) {
            ans[count[(arr[i] / exp) % 10] - 1] = arr[i] ;
            count[(arr[i] / exp) % 10]--;
        }

        for(i = 0; i < len; i++) {
            arr[i] = ans[i] ;
        }
    }

    private static int getMax(int[] arr, int len) {
        int max = arr[0] ;
        for(int i = 1; i < len; i++) {
            max = Math.max(max, arr[i]) ;
        }
        return max;
    }
}