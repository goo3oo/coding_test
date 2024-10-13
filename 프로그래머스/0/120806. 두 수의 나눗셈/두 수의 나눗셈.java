class Solution {
    public int solution(int num1, int num2) {
        int answer = 0; 
        if(num1>0 &&
           num1<=100 &&
           num2>0 &&
           num2<=100){
            double d_num1 = (double)num1;
            double d_num2 = (double)num2;
            answer = (int)((d_num1/d_num2)*1000);
            }
         return answer;
    }
}