// Online C compiler to run C program online
#include <stdio.h>
#define MEDIA(x,y) ((3.5*A + 7.5*B) / 11)

int main() {
    double A,B;
    
    scanf("%lf\n%lf", &A, &B);
    
    double x = MEDIA(A,B);
    
    printf("MEDIA = %.5lf\n", x);
    
    return 0;
}