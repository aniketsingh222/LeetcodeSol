class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int m[] = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int s = 0; //sum of days
        int y = 1971;
        while(year>y){
            s += 365;
            if(y%4==0 && y%100!=0 || y%400==0){
                s++;
            }
            y++;
        }
        s += m[month-1] + day;
        if(month>2&&(y%4==0 && y%100!=0 || y%400==0)){
            s++;
        }
        switch(s%7){
                case(0):
                return "Thursday";
                case(1):
                return "Friday";
                case(2):
                return "Saturday";
                case(3):
                return "Sunday";
                case(4):
                return "Monday";
                case(5):
                return "Tuesday";
                case(6):
                return "Wednesday";
        }
        
        return "";
    }
}