using System; 
using static System.Console;

// class URI {

    // static void Main(string[] args) { 

        int valor = int.Parse(ReadLine());
        WriteLine(valor);

        int[] notas = new int[7] {100, 50, 20, 10, 5, 2, 1};

        for (int i = 0; i <= 6; i++){
            int nota = notas[i];
            int qntd = valor/nota;
            valor -= qntd*nota;
            WriteLine($"{qntd} nota(s) de R$ {nota},00");
        }

    // }

// }