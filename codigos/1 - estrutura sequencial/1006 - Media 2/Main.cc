// Online C compiler to run C program online
#include <stdio.h>
#define MEDIA(x,y,z) ((2*x + 3*y + 5*z) / 10); 

int main() {
    double A,B,C;
    
    scanf("%lf\n%lf\n%lf", &A, &B, &C);
    
    double x = MEDIA(A,B,C);
    
    printf("MEDIA = %.1lf\n", x);
    
    return 0;
}