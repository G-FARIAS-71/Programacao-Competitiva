using System; 
using static System.Console;

// class URI {

    // static void Main(string[] args) { 

        int h = int.Parse(ReadLine());
        int km = int.Parse(ReadLine());

        string gasto = Math.Round(h * km / 12.0, 3).ToString("F3");

        WriteLine(gasto);
    // }

// }