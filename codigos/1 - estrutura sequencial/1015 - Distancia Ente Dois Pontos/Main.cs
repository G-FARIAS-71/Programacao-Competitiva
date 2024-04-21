using System;
using static System.Console;

// class URI {
    static double[] processar_entrada(){
        string[] linha = ReadLine().Split(' ');
        double[] valores = Array.ConvertAll(linha, x => double.Parse(x));
        return valores;
    }

    static double calcular_distancia(double[] e1, double[] e2){
        return Math.Sqrt(Math.Pow(e2[0] - e1[0], 2) + Math.Pow(e2[1] - e1[1], 2));
    }

    // static void Main(string[] args) { 
        double distancia = calcular_distancia(processar_entrada(), processar_entrada());
        string saida = Math.Round(distancia, 4).ToString("F4");
        WriteLine(saida);
    // }
// }