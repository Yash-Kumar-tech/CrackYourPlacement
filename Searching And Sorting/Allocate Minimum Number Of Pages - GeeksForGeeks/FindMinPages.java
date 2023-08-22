class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]arr,int N,int M)
    {
        int sum = 0 ;
        if(N < M)   return -1 ;
        int max = arr[0];
        for(int i = 0; i < N; i++) {
            sum += arr[i] ;
            max = arr[i] > max ? arr[i] : max ;
        }
        int st = arr[N - 1], en = sum, res = Integer.MAX_VALUE ;
        while(st <= en) {
            int mid = st + (en - st) / 2 ;
            if(check(arr, N, M, mid)) {
                res = mid ;
                en = mid - 1 ;
            } else {
                st = mid + 1 ;
            }
        }
        return res ;
    }
    
    private static boolean check(int[] arr, int N, int M, int currMin) {
        int studReq = 1, currSum = 0;
        for(int i = 0; i < N; i++) {
            currSum += arr[i] ;
            if(currSum > currMin) {
                studReq++ ;
                currSum = arr[i] ;
            }
        }
        return studReq <= M ;
    }
};