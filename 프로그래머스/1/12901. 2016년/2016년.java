import java.util.Calendar;

class Solution {
    public String solution(int a, int b) {
      String[] weekdays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, a-1, b);
        int datOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return weekdays[datOfWeek - 1];
    }
}