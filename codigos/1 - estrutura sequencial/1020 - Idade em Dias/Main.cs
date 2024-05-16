using System;
using static System.Console; 

// class URI {

    // static void Main(string[] args) { 

        int total = int.Parse(ReadLine());
        int anos = total / 365;
        int meses = (total - anos * 365) / 30;
        int dias = total - anos * 365 - meses * 30;

        WriteLine($"{anos} ano(s)");
        WriteLine($"{meses} mes(es)");
        WriteLine($"{dias} dia(s)");

    // }

// }