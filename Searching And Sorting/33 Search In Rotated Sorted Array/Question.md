## 33. Search In Rotated Sorted Array

There is an integer array <code>nums</code> sorted in ascending order (with distinct values).

Prior to being passed to your function, <code>nums</code> is possibly rotated at an unknown pivot index <code>k</code> (<code>1 <= k < nums.length</code>) such that the resulting array is <code>[nums[ k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]</code> (0-indexed). For example, <code>[0,1,2,4,5,6,7]</code> might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array <code>nums</code> after the possible rotation and an integer target, return the index of target if it is in <code>nums</code>, or <code>-1</code> if it is not in <code>nums</code>.

You must write an algorithm with <code>O(log n)</code> runtime complexity.