// Online C compiler to run C program online
#include <stdio.h>
#define CALCULO(q1, v1, q2, v2) (q1*v1 + q2*v2)

int main() {
    int q1, q2;
    double v1, v2;
    scanf("%*d %d %lf\n%*d %d %lf", &q1, &v1, &q2, &v2);
    printf("VALOR A PAGAR: R$ %.2lf\n", CALCULO(q1,v1,q2,v2));
    return 0;
}