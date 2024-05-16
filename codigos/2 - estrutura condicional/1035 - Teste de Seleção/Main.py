def validade(A: int, B: int, C: int, D: int) -> bool:
    return B > C and D > A and C+D > A+B and C > 0 and D > 0 and A % 2 == 0

def main() -> None:
    numeros: list[int] = [int(x) for x in input().split(' ')]
    eh_valido: bool = validade(*numeros)
    print("Valores aceitos" if eh_valido else "Valores nao aceitos")
    
if __name__ == "__main__":
    main()