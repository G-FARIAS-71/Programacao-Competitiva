// Online C compiler to run C program online
#include <stdio.h>

int max(int a, int b){
    return a >= b ? a : b;
}

int main() {
    int A,B,C;
    scanf("%d %d %d", &A, &B, &C);
    printf("%d eh o maior\n", max(max(A,B),C));
}