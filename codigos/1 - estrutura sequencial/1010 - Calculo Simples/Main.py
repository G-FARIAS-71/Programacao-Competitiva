def number(n: list):
    return [int(n[1]), float(n[2])]

n1, v1 = number(input().split())

n2, v2 = number(input().split())

total: float = n1*v1 + n2*v2

print(f"VALOR A PAGAR: R$ {total:.2f}")