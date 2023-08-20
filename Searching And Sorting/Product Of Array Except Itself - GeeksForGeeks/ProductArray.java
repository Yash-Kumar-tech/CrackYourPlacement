import java.util.Arrays;

/**
 * ProductArray
 */
public class ProductArray {

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2} ;
        int[] prod = new int[arr.length] ;
        System.out.print("Original Array: ");
        product(arr, prod);
        for(int i: arr) {
            System.out.print(i + " ") ;
        }
        System.out.print("\nProduct Array: ") ;
        for(int i: prod) {
            System.out.print(i + " ");
        }
    }

    private static void product(int[] arr, int[] prod) {
        int len = arr.length ;
        if(len == 1) {
            return ;
        }
        int tmp = 1 ;
        Arrays.fill(prod, 1) ;
        for(int i = 0; i < len; i++) {
            prod[i] = tmp ;
            tmp *= arr[i] ;
        }
        tmp = 1 ;
        for(int i = len - 1; i >= 0; i--) {
            prod[i] *= tmp ;
            tmp *= arr[i] ;
        }
    }
}