valor = int(input())
print(valor)

def calcular_nota(nota: int) -> None:
    global valor
    qntd: int = valor//nota
    valor -= qntd*nota
    print(f"{qntd} nota(s) de R$ {nota},00")
    

notas: list[int] = [100, 50, 20, 10, 5, 2, 1]

for nota in notas:
    calcular_nota(nota)