from math import pow

A, B, C = map(float, input().split())

area_triangulo: float = A*C / 2
area_circulo: float = 3.14159 * pow(C, 2)
area_trapezio: float = (A+B) * C / 2
area_quadrado: float = pow(B,2)
area_retangulo: float = A*B

print(f"TRIANGULO: {area_triangulo:.3f}")
print(f"CIRCULO: {area_circulo:.3f}")
print(f"TRAPEZIO: {area_trapezio:.3f}")
print(f"QUADRADO: {area_quadrado:.3f}")
print(f"RETANGULO: {area_retangulo:.3f}")