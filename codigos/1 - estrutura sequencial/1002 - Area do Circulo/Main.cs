using System;
using System.Globalization;

// class URI {
    static double PI = 3.14159;

    static string calcular_area(double raio){
        double area = PI * Math.Pow(raio, 2);
        return Math.Round(area, 4).ToString("F4");
    }

    // static void Main(string[] args) { 
        CultureInfo.CurrentCulture = CultureInfo.CreateSpecificCulture("en-US");
        double raio = double.Parse(Console.ReadLine());
        string area = calcular_area(raio);
        Console.WriteLine($"A={area}");
    // }
// }