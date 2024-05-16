using System;
using static System.Console; 

// class URI {

    static bool validade(int A, int B, int C, int D){
        return 
            B > C && 
            D > A && 
            C+D > A+B && 
            C > 0 && 
            D > 0 &&
            A % 2 == 0;
    }   

    // static void Main(string[] args) { 

        string[] entrada = ReadLine().Split(' ');
        int[] numeros = Array.ConvertAll(entrada, x => int.Parse(x));

        int A = numeros[0];
        int B = numeros[1];
        int C = numeros[2];
        int D = numeros[3];

        bool eh_valido = validade(A,B,C,D);

        if (eh_valido) WriteLine("Valores Aceitos");
        else WriteLine("Valores nao aceitos");
    // }

// }