import java.util.HashMap;

/**
 * FindPair
 */
public class FindPair {

    public static void main(String[] args) {
        int[] arr = {1, 8, 30, 40, 100} ;
        int diff = 60 ;
        int[] pair = findPair(arr, diff);
        if(pair[0] == -1 && pair[1] == -1) {
            System.out.println("No pair found.");
        } else {
            System.out.println("Required pair: " + pair[0] + "," + pair[1]) ;
        }
    }

    private static int[] findPair(int[] arr, int diff) {
        HashMap<Integer, Integer> map = new HashMap<>() ;
        int[] ans = {-1, -1} ;
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1) ;

            if(diff == 0 && map.get(arr[i]) > 1) {
                return new int[]{arr[i], arr[i]};
            }
        }
        if(diff == 0) {
            return new int[]{-1, -1};
        }

        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(diff + arr[i])) {
                return new int[]{arr[i], diff + arr[i]} ;
            }
        }
        return new int[]{-1, -1} ;
    } 
}