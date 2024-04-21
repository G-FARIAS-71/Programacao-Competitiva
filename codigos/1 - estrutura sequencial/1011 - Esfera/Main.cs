using System;
using System.Globalization;

// class URI {
    static double PI = 3.14159;

    static string calcular_volume(double raio){
        double volume = 4/3.0 * PI * Math.Pow(raio, 3);
        return Math.Round(volume, 3).ToString("F3");
    }

    // static void Main(string[] args) { 
        CultureInfo.CurrentCulture = CultureInfo.CreateSpecificCulture("en-US");
        double raio = double.Parse(Console.ReadLine());
        string volume = calcular_volume(raio);
        Console.WriteLine($"VOLUME = {volume}");
    // }
// }