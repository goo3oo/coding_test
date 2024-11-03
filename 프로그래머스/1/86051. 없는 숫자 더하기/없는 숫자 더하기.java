class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int totalNumeral = 45;
        int totalNumbers = 0;
        
        for(int num : numbers ) {
            totalNumbers += num;
        };
        
        answer = totalNumeral - totalNumbers;
        return answer;
    }
}