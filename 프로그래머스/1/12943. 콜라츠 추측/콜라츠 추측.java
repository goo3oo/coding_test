class Solution {
    public long solution(long num) {
           long answer = 0;

        while (num != 1) {
            if (answer >= 500) { // 500번 이상 반복되면 -1을 반환
                answer =  -1;
            }

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
        }
        return answer;
    }
}