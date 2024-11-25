import java.util.*; 

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> sList = new ArrayList<>();
     
        for(String s : strings){
            sList.add(s.charAt(n)+s);
        }
        
        Collections.sort(sList);
        
        String[] answer = new String[strings.length];
        
        for (int i = 0; i < sList.size(); i++) {
            answer[i] = sList.get(i).substring(1);
        }
    
        return answer;
    }
}