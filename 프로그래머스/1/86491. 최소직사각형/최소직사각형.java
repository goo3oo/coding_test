class Solution {
    public int solution(int[][] sizes) {
      
        int answer = 0;
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>sizes[i][1]){
                    int temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
            if(maxHeight < sizes[i][1]){
               maxHeight = sizes[i][1];
                }
            if(maxWidth < sizes[i][0]){
                maxWidth = sizes[i][0];
             }
        }
        answer = maxWidth * maxHeight;
        return answer;
    }   
}