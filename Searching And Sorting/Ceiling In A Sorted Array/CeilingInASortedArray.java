/**
 * CeilingInASortedArray
 */
public class CeilingInASortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12} ;
        System.out.println("Ceiling For 12 = " + ceil(arr, 12)) ;
        System.out.println("Ceiling For 10 = " + ceil(arr, 10));
        System.out.println("Ceiling For 8 = " + ceil(arr, 8));
    }

    private static int ceil(int[] arr, int i) {
        int beg = 0, end = arr.length - 1 ;
        while(beg <= end) {
            int mid = beg + (end - beg) / 2 ;
            if(arr[mid] == i) {
                return arr[mid] ;
            } else if(arr[mid] < i) {
                beg = mid + 1 ;
            } else {
                end = mid - 1 ;
            }
        }
        return arr[beg];
    }
}