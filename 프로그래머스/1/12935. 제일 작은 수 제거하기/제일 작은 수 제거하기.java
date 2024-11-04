class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            return new int[]{-1};        
        }
        
        int[] answer = new int[arr.length-1];
        
        int minNum = arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=minNum){
                minNum=arr[i];
            }
        }
        int index = 0;
        for(int num:arr){
            if(num!=minNum){
                answer[index++]=num;
            }
        }
        return answer;
    }
}