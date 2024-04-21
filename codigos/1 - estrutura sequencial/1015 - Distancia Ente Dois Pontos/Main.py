import math

x1, y1 = map(float, input().split())
x2, y2 = map(float, input().split())

distancia: float = math.sqrt(math.pow(x2-x1, 2) + math.pow(y2-y1, 2))

print(f"{distancia:.4f}")