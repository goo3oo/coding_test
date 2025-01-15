import java.util.Calendar;

class Solution {
    
    private final int[] DAYS_IN_MONTH_NORMAL = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int[] DAYS_IN_MONTH_LEAP = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final String[] WEEKDAYS = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public String solution(int a, int b) {
        int year = 2016;
        int[] daysInMonth = isLeapYear(year) ? DAYS_IN_MONTH_LEAP : DAYS_IN_MONTH_NORMAL;
        String yearStartDay = "FRI";

        int addDay = 0;
        for (int i = 0; i < WEEKDAYS.length; i++) {
            if(WEEKDAYS[i].equals(yearStartDay)) {
                addDay = i;
                break;
            }
        }

        int totalDays = 0;
        for (int i = 0; i < a-1 ; i++) {
            totalDays += daysInMonth[i];
        }

        totalDays += b;

       int dayIndex = (addDay + totalDays-1) % 7;

       return WEEKDAYS[dayIndex];
    }
}