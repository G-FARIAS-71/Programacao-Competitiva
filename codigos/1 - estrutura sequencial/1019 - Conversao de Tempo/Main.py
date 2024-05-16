from math import floor

segundos = int(input())
saidas: list[int] = []
for tempo in (tempos:=[3600, 60, 1]):
    qntd_tempo_temp = floor(segundos/tempo) if segundos >= tempo else 0
    saidas.append(qntd_tempo_temp)
    segundos -= qntd_tempo_temp * tempo

print(":".join(map(str, saidas)))