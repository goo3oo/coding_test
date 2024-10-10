#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int answer = num1*num2;
    scanf("%d %d", &num1, &num2);
    if(0<=num1 && num1<=100 && 0<=num2 && num2<=100)
    return answer;
}