class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a;
        int b;
        int r;
        
        if(n>m){
            a=n;
            b=m;
        }else{
            a=m;
            b=n;
        }

        r=a%b;
        if(r==0){
            answer[0]=b;
            answer[1]=n*m/b;
        }
        
        while(r!=0){
            r=a%b;  
            a=b;
            b=r; 
            answer[0]=a;
            answer[1]=n*m/a;
        }
        
        return answer;
    }
}