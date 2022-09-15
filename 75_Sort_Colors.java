class Solution {
    public void sortColors(int[] nums) {
           int[] counts = new int[3];
           int n = nums.length;
           for(int i=0; i<n; i++)counts[nums[i]]++;
           int i=0;                     
           for(; i < counts[0]; i++)nums[i] = 0;
           for(; i < counts[0] + counts[1]; i++)nums[i] = 1;
           for(; i < counts[0] + counts[1] + counts[2]; i++)nums[i] = 2;
       }
   }