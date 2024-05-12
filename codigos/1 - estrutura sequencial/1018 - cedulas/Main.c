// Online C compiler to run C program online
#include <stdio.h>

int main() {
    int valor;
    scanf("%d", &valor);
    printf("%d\n", valor);
    
    int notas[] = {100, 50, 20, 10, 5, 2, 1};
    
    for (int i = 0; i <= 6; i++){
        int nota = notas[i];
        int qntd = valor/nota;
        valor -= qntd*nota;
        printf("%d nota(s) de R$ %d,00\n", qntd, nota);
    }
}