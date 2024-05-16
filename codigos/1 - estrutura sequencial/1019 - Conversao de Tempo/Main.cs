using System;
using static System.Console;

// class URI {

    // static void Main(string[] args) { 

        int total = int.Parse(ReadLine());
        int horas = total / 3600;
        int minutos = (total % 3600) / 60;
        int segundos = total % 60;

        WriteLine($"{horas}:{minutos}:{segundos}");

    // }

// }