class Solution {
    public long solution(long n) {
        long squareRoot = (long)Math.sqrt(n);   
    
        return (squareRoot*squareRoot==n) ? (squareRoot+1)*(squareRoot+1) : -1;
    }
}