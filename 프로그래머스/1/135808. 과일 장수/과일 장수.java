import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int maxScore = 0;

        Arrays.sort(score);

        for (int i = score.length - 1; i - m + 1 >= 0; i -= m) {
            int minScore = score[i - m  + 1];
            maxScore += minScore * m;
        }return maxScore;
    }
}