import java.util.Arrays;
import java.util.Collections;

public class PermuteTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3} ;
        int[] arr2 = {7, 8, 9} ;
        int k = 9 ;
        System.out.println("Answer: " + check(arr1, arr2, k));
    }

    private static boolean check(int[] arr1, int[] arr2, int k) {
        Arrays.sort(arr1) ;
        Arrays.sort(arr2) ;
        int len = arr1.length ;
        for(int i = 0; i < len; i++) {
            if(arr1[i] + arr2[len - 1 - i] < k) {
                return false ;
            }
        }
        return true ;
    }
}