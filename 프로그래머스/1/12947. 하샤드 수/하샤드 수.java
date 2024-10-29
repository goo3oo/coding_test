class Solution {
    public boolean solution(int x) {
        int digitSumTotal = 0;
        for(int i = x ;i>0;i/=10){
            digitSumTotal+=i%10;
        }

        boolean answer;
        if(x%digitSumTotal!=0){
            answer = false;
        }else{
            answer = true;
        } return answer;
    }
}