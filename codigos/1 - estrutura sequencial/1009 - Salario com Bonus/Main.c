#include <stdio.h>

int main() {
    double salario_fixo, receita_vendas;
    
    scanf("%*s\n%lf\n%lf", &salario_fixo, &receita_vendas);
    
    printf("TOTAL = R$ %.2lf\n", salario_fixo + 0.15 * receita_vendas);
    
    return 0;
}