import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int index = 0;
        
        ArrayList<Integer> ternaryArr = new ArrayList<>();

 
        while (n > 0) {
            ternaryArr.add(n % 3);
            n /= 3;              
        }


        for (int i = ternaryArr.size() - 1; i >= 0; i--) {
            answer += (int) Math.pow(3, i) * ternaryArr.get(index++);
        }

        return answer;
    }
}