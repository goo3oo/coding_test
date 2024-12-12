import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> topThreeScore = new PriorityQueue<>(); 
        int[] answer = new int[score.length]; 
        int index = 0;
        
        for (int s : score) {
            topThreeScore.add(s); 
            if (topThreeScore.size() > k) {
                topThreeScore.poll(); 
            }
            answer [index++] = topThreeScore.peek(); 
        }
        
        return answer;
    }
}