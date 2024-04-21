using System;
using static System.Console;

// class URI {
    // static void Main(string[] args) { 
        int A = int.Parse(ReadLine());
        double B = double.Parse(ReadLine());

        string res = Math.Round(A/B,3).ToString("F3");

        WriteLine($"{res} km/l");
    // }
// }