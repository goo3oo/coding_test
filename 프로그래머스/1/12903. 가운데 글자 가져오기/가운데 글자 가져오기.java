class Solution {
    public String solution(String s) {
        int index = s.length()/2;
        
        String answer =  (s.length()%2==1) 
            ? String.valueOf(s.charAt(index))
            : s.charAt(index-1)+""+s.charAt(index);
        
        return answer;
    }
}