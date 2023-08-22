/**
 * EqualWIthMinCost
 */
public class EqualWIthMinCost {

    public static void main(String[] args) {
        int[] arr = {1, 100, 101} ;
        int target = 100 ;
        System.out.println("Minimum cost: " + getMinCost(arr, target));
    }

    private static int getMinCost(int[] arr, int target) {
        int l = arr[0], h = arr[0] ;
        for(int i = 0; i < arr.length; i++) {
            l = Math.min(l, arr[i]) ;
            h = Math.max(h, arr[i]) ;
        }
        
        while((h - l) > 2) {
            int m1 = l + (h - l) / 3 ;
            int m2 = h - (h - l) / 3 ;

            int c1 = getCost(arr, m1) ;
            int c2 = getCost(arr, m2) ;

            if(c1 < c2) {
                h = m2 ;
            } else {
                l = m1 ;
            }
        }
        return getCost(arr, (l + h) / 2);
    }

    private static int getCost(int[] arr, int target) {
        int sum = 0 ;
        for(int i: arr) {
            sum += Math.abs(i - target) ;
        }
        return sum ;
    }
}