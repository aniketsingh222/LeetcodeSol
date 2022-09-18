class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int[] cache = new int[201];
        int count = 0;
        for (int n : nums){
            int prev = n - diff;
            if (prev >= 0){cache[n] = cache[prev] + 1;} 
            else {cache[n] = 1;}
            if (cache[n] >= 3){count++;}
        }
        return count;
    }
}