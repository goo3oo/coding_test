class Solution {
    public String solution(String s) {
        char[] result = new char[s.length()];
        int index = 0;
        int wordIndex = 0;
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                result[index++] = c;
                wordIndex = 0;
            }else{
                if(wordIndex % 2 == 0 ){
                    result[index++] = Character.toUpperCase(c);
                }else{
                    result[index++] = Character.toLowerCase(c);
                }wordIndex++;
            }
        }           
        String answer = new String(result);
        return answer;
    }
}