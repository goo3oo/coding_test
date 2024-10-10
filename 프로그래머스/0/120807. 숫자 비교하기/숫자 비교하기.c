#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
   
    if (num1==num2){
        int answer = 1;
        scanf("%d %d %d", &num1, &num2, &answer);
        printf("num1이 %d이고 num2가 %d이므로 같습니다. 따라서 %d를 return합니다.",num1,num2,answer);
        return answer;}
        
         
    else{
        int answer = -1;
        scanf("%d %d %d", &num1, &num2, &answer);
        printf("num1이 %d이고 num2가 %d이므로 다릅니다. 따라서 %d를 return합니다.",num1,num2,answer);
        return answer;}
        
        
}
