import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
  
        Set<Integer> result = new HashSet<>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1 ; j < numbers.length; j++){
                result.add(numbers[i]+numbers[j]);
            }
        }
        
        /* 느려...
        int[] answer = result.stream()
                        .mapToInt(Integer::intValue) 
                        .toArray();
                        */
        Integer[] integerArray = result.toArray(new Integer[0]); 
            
        int[] answer = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            answer[i] = integerArray[i];
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
