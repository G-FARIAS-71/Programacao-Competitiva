// Online C compiler to run C program online
#include <stdio.h>

int main() {
    int number;
    int horas;
    double salario_hora;
    
    scanf("%d\n%d\n%lf", &number, &horas, &salario_hora);
    
    printf("NUMBER = %d\n", number);
    printf("SALARY = U$ %.2lf\n", horas*salario_hora);
    
    return 0;
}