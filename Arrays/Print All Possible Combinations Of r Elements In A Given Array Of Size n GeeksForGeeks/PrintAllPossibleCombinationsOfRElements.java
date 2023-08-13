import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PrintAllPossibleCombinationsOfRElements {
    public static void main(String[] args) {
        int inputArr[] = {1, 2, 3, 4} ;
        int r = 2 ;
        List<Integer[]> output = printAllPossibleCombinations(inputArr, r) ;
        for(Integer[] combination: output) {
            for(int i: combination) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static List<Integer[]> printAllPossibleCombinations(int[] inputArr, int r) {
        Arrays.sort(inputArr) ;
        List<Integer[]> ans = new ArrayList<>();
        Integer[] curr = new Integer[r] ;
        solve(inputArr, curr, 0, inputArr.length - 1, 0, r, ans);
        return ans ;
    }

    private static void solve(int[] inputArr, Integer[] curr, int beg, int end, int ind, int r, List<Integer[]> ans) {
        if(ind == r) {
            Integer[] temp = new Integer[r] ;
            for(int i = 0; i < r; i++) {
                temp[i] = curr[i] ;
            }
            ans.add(temp) ;
            return ;
        }
        for(int i = beg; i <= end && end - i + 1 >= r - ind; i++) {
            curr[ind] = inputArr[i] ;
            solve(inputArr, curr, i + 1, end, ind + 1, r, ans);
        }
    }
}