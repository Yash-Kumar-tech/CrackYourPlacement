class Solution {
    public void sortColors(int[] nums) {
        int beg = 0, end = nums.length - 1 ;
        int mid = 0 ;
        while(mid <= end) {
            if(nums[mid] == 0) {
                int temp = nums[beg] ;
                nums[beg++] = nums[mid] ;
                nums[mid++] = temp ;
            } else if(nums[mid] == 1) {
                mid++ ;
            } else {
                int temp = nums[mid] ;
                nums[mid] = nums[end] ;
                nums[end--] = temp ;
            }
        }
    }
}

//Alternate Solution
class Solution {
    public void sortColors(int[] nums) {
        int rC = 0, bC = 0, wC = 0 ;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)        rC++;
            else if(nums[i] == 1)   bC++; 
            else                    wC++ ;
        }
        int ind = 0 ;
        while(rC > 0) {
            nums[ind++] = 0 ;
            rC--;
        }
        while(bC > 0) {
            nums[ind++] = 1 ;
            bC-- ;
        }
        while(wC > 0) {
            nums[ind++] = 2 ;
            wC--;
        }
    }
}