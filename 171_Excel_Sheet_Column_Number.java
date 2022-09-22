class Solution {
    public int titleToNumber(String columnTitle) {
        int[] arr = new int[26];
        int pow = 0;
        int n = columnTitle.length();
        int ans = 0;
        for(int i = n-1; i>=0; i--){
            int num = (columnTitle.charAt(i) - 'A') + 1;
            ans += (int)Math.pow(26,pow++)*num;
        }
        return ans;
    }
}