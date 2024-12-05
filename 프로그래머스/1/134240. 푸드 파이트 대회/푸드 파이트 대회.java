public class Solution {
   public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < food.length ; i++){
          int number = food[i]/2;
          for(int j = 0; j < number ; j++){
              answer.append(i);
          }
        }
        answer.append(0);
        String reversed = new StringBuilder(answer.substring(0, answer.length() - 1)).reverse().toString();
        answer.append(reversed);
        return answer.toString();
    }
}