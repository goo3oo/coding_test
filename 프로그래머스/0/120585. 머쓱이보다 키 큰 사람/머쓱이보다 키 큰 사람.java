class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if(array.length>=1 && 
               array.length<=100 && 
               height>=1 && 
               height<=200 &&
               array[i]>=1 &&
               array[i]<=200&&
               array[i]>height){
                answer++;
            }
        } 
        return answer;
    }
}