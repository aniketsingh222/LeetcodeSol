class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
           if(even(num)){
               count++;
           } 
        }return count;
    }
    int digits(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
    boolean even(int num){
        int numdigits =digits(num);
        return numdigits%2==0;
    }
}