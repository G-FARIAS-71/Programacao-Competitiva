from math import floor

dias = int(input())
saidas: list[int] = []
for val, tempo in zip(tempos_val:=[365, 30, 1], tempos:=["ano(s)", "mes(es)", "dia(s)"]):
    qntd_tempo = floor(dias/val) if dias >= val else 0
    print(f"{qntd_tempo} {tempo}")
    dias -= qntd_tempo * val