// Online C compiler to run C program online
#include <stdio.h>
#include <math.h>
#define PI 3.14159
#define TRIANGULO(A,C) (A*C/2.0)
#define CIRCULO(C) (PI * pow(C,2))
#define TRAPEZIO(A,B,C) ((A+B)*C/2.0)
#define QUADRADO(B) (pow(B,2))
#define RETANGULO(A,B) (A*B)

int main() {
    double A,B,C;
    scanf("%lf %lf %lf", &A, &B, &C);
    printf("TRIANGULO: %.3lf\n", TRIANGULO(A,C)); 
    printf("CIRCULO: %.3lf\n", CIRCULO(C));
    printf("TRAPEZIO: %.3lf\n", TRAPEZIO(A,B,C));
    printf("QUADRADO: %.3lf\n", QUADRADO(B));
    printf("RETANGULO: %.3lf\n", RETANGULO (A,B));
}