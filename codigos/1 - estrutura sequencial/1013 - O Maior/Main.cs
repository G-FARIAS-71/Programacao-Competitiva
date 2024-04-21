using System; 
using static System.Console;

// class URI {
    // static void Main(string[] args) { 
        string[] linha = ReadLine().Split(' ');

        int A = int.Parse(linha[0]);
        int B = int.Parse(linha[1]);
        int C = int.Parse(linha[2]);

        int maior = Math.Max(Math.Max(A, B), C);

        WriteLine($"{maior} eh o maior");
    // }
// }