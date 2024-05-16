// Online C compiler to run C program online
#include <stdio.h>

int main() {
    int segundos;
    scanf("%d", &segundos);
    
    int tempos[] = {3600, 60, 1};
    
    for (int i = 0;; i++){
        int tempo = tempos[i];
        int qntd = segundos/tempo;
        printf("%d", qntd);
        if (i == 2){
            printf("\n");
            break;
        }
        else printf(":");
        segundos -= qntd*tempo;
    }
}