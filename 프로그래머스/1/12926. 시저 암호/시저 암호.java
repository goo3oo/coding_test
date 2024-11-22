class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLowerCase(c)){
                sb.append((char)('a'+(c-'a'+n)%26));
            }
            else if(Character.isUpperCase(c)){
                sb.append((char)('A'+(c-'A'+n)%26));
            }else{
                sb.append(" ");
            }

            
        }
        String answer = sb.toString();
        
        return answer;
    }
}