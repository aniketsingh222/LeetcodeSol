class Solution {
    public int addDigits(int num) {
      int r,sum=0;
        while(num>9){
            while(num!=0){
                r = num%10;
                sum+=r;
                num/=10;
                }
            num=sum;
            sum=0;
        }
    return num;
    }
}