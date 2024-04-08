//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

public class Solution {
    public int findMin(int[] nums){
      int p = findPivot(nums);
      if (p == -1) {
        return nums[0];
      }
  
      return nums[p + 1];
    }
  
    int findPivot(int[] nums){
      int start = 0;
      int end  = nums.length-1;
  
      while (start <= end) {
        int mid = start + (end - start) / 2;
  
        if (mid < end && nums[mid] > nums[mid + 1]) {
          return mid;
        }
  
        if (mid > start && nums[mid] < nums[mid - 1]) {
          return mid - 1;
        }
  
        if (nums[0] > nums[mid]) {
          end = mid;
        }
  
        else{
          start = mid + 1;
        }
      }
      return -1;
    }
  }