import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
  
        int index = 0;
        int length = 0;

        for(int i = 1; i < numbers.length ; i++){
            length += i;
        }


        int[] temp = new int[length];
        int[] temp2 = new int[length];

        for(int i = 0; i< numbers.length;i++){
            for(int j = i + 1 ; j < numbers.length; j++){
               temp[index++] = numbers[i] + numbers[j];
            }
        }
        index = 0;
        Arrays.sort(temp);

        for(int i = 0 ; i < temp.length-1; i++){
            if(temp[i] != temp[i+1]){
                temp2[index++] = temp[i];
            }
        }
        temp2[index++] = temp[temp.length-1];

        int[] answer = Arrays.copyOf(temp2, index);

            return answer;

    }
}