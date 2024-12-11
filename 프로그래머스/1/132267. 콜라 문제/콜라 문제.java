class Solution {
    public int solution(int a, int b, int n) {
        
        int totalCola = 0;
        int hasCola = n; 

        while (hasCola >= a) {
      
            int getCola = (hasCola / a) * b;
            totalCola += getCola;

            hasCola = (hasCola % a) + getCola;
        }
        return totalCola;
    }
}
