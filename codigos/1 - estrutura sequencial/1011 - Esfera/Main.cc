// Online C compiler to run C program online
#include <stdio.h>
#include <math.h>
#define PI 3.14159
#define VOLUME(raio) (4/3.0 * PI * pow(raio, 3))

int main() {
    int raio; 
    scanf("%d", &raio);
    printf("VOLUME = %.3lf\n", VOLUME(raio));
    return 0;
}