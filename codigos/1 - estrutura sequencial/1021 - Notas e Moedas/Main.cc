// Online C compiler to run C program online
#include <stdio.h>

int main() {
    double valor; 
    scanf("%lf", &valor);
    
    valor += 0.00001;
    
    double notas[] = {100, 50, 20, 10, 5, 2};
    double moedas[] = {1, .5, .25, .1, .05, .01};
    
    printf("NOTAS:\n");
    for (int i = 0; i < 6; i++){
        double nota = notas[i];
        int qntd = valor/nota;
        valor -= qntd*nota;
        printf("%d nota(s) de R$ %.2lf\n", qntd, nota);
    }
    
    printf("MOEDAS:\n");
    for (int i = 0; i < 6; i++){
        double moeda = moedas[i];
        int qntd = valor/moeda;
        if (i == 5) valor = moeda;
        else valor -= qntd*moeda;
        printf("%d moeda(s) de R$ %.2lf\n", qntd, moeda);
    }
}