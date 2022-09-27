class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null) return 0;
        int[] sumArr = new int[nums.length];
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
            sumArr[i] = sum;
        }
        if(sum < s) return 0;
        int globalAns = Integer.MAX_VALUE;
        for(int i = 0;i< nums.length;i++){
            int target = (i == 0? s: s + sumArr[i-1]);
            if(sum < target) break;
            int low = i;
            int high = nums.length - 1;
            while(low <= high){
                int mid = (high - low)/2 + low;
                if(sumArr[mid] < target){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
            globalAns = Math.min(globalAns, low - i + 1);
        }
        return globalAns==Integer.MAX_VALUE?0:globalAns;
    }
}