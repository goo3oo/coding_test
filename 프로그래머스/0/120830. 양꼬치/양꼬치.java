class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int lambPrice = 12000*n;
        int drinkPrice = 2000*k;
        int service = n/10;
        if(n>1){
            answer = lambPrice+drinkPrice-(service*2000);
        }else{
             answer = lambPrice+drinkPrice;
        }
        return answer;
    }
}