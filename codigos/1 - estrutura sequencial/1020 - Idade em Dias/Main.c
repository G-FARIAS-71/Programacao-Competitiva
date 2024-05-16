// Online C compiler to run C program online
#include <stdio.h>

int main() {
    int dias;
    scanf("%d", &dias);
    
    int tempos_val[] = {365, 30, 1};
    char* tempos[] = {"ano(s)", "mes(es)", "dia(s)"};
    
    for (int i = 0; i < 3; i++) {
        int tempo_val = tempos_val[i];
        char* tempo = tempos[i];
        int qntd = dias / tempo_val;
        printf("%d %s\n", qntd, tempo);
        dias -= qntd * tempo_val;
    }
}