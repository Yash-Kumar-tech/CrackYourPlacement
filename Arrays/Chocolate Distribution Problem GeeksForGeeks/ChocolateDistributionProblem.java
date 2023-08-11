import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number of packets:");
        int N = sc.nextInt();
        int[] chocolates = new int[N];
        for(int i = 0; i < N; i++) {
            System.out.print("Enter number of chocolates in packet:");
            chocolates[i] = sc.nextInt();
        }
        System.out.print("Enter number of children:");
        int m = sc.nextInt();
        int n = chocolates.length;
        System.out.println("Minimum Difference: "+findMinimumDifference(chocolates, m, n)) ;
    }

    private static int findMinimumDifference(int[] chocolates, int m, int n) {
        if(m == 0 || n == 0 || n < m)    return 0 ;
        //invalid cases
        Arrays.sort(chocolates);
        int minDiff = Integer.MAX_VALUE ;
        for(int i = 0; i <= n - m; i++) {
            int diff = chocolates[i + m - 1] - chocolates[i] ;
            minDiff = Math.min(diff, minDiff) ;
        }
        return minDiff;
    }
}
