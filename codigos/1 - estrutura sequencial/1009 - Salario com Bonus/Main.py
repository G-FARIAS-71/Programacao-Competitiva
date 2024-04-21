input()

salario_fixo: float = float(input())
valor_vendas: float = float(input())

salario_total: float = salario_fixo + 0.15 * valor_vendas

print(f"TOTAL = R$ {salario_total:.2f}")