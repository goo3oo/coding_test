import java.util.Arrays;

class Solution {
    public long solution(long n) {
     String nmToStr = String.valueOf(n);

        char[] charArray = nmToStr.toCharArray();

        Arrays.sort(charArray);

        StringBuilder sb = new StringBuilder();
        for(int i = charArray.length - 1; i >= 0; i--) {
            sb.append(charArray[i]);
        }
        
        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}