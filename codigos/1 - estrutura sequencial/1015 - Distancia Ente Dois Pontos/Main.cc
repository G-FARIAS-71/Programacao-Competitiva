// Online C compiler to run C program online
#include <stdio.h>
#include <math.h>
#define DISTANCIA(x1,y1,x2,y2) (sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2)))

int main() {
    double x1, y1, x2, y2;
    scanf("%lf %lf\n%lf %lf", &x1, &y1, &x2, &y2);
    printf("%.4lf\n", DISTANCIA(x1,y1,x2,y2));
}