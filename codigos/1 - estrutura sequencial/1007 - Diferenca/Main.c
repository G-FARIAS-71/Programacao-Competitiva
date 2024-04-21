// Online C compiler to run C program online
#include <stdio.h>
#define DIFERENCA(A,B,C,D) (A * B - C * D)

int main() {
    int A,B,C,D;
    
    scanf("%d\n%d\n%d\n%d", &A, &B, &C, &D);
    
    int x = DIFERENCA(A,B,C,D);
    
    printf("DIFERENCA = %d\n", x);
    
    return 0;
}