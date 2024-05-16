// Online C compiler to run C program online
#include <stdio.h>
#include <stdbool.h>

bool validade(int A, int B, int C, int D){
    return 
        B > C && 
        D > A && 
        C+D > A+B && 
        C > 0 && 
        D > 0 &&
        A % 2 == 0;
}

int main() {
    int A,B,C,D;
    scanf("%d %d %d %d", &A, &B, &C, &D);
    
    bool entradas_validas = validade(A,B,C,D);
    
    if (entradas_validas) printf("Valores aceitos");
    else printf("Valores nao aceitos");
    
    printf("\n");

    return 0;
}