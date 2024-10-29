class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int startInt = Math.min(a,b);
        int endInt = Math.max(a,b);
        
        for(int i = startInt; i <= endInt ; i++){
            answer += i;
        }
        return answer;
    }
}

