using System;
using System.Globalization;

// class URI {
    static double calcular_media(double A, double B, double C){
        double media = (2 * A + 3 * B + 5 * C) / 10;
        return Math.Round(media, 1);
    }
    // static void Main(string[] args) { 
        CultureInfo.CurrentCulture = CultureInfo.CreateSpecificCulture("en-US");
        double A = double.Parse(Console.ReadLine());
        double B = double.Parse(Console.ReadLine());
        double C = double.Parse(Console.ReadLine());
        string media = calcular_media(A, B, C).ToString("F1");
        Console.WriteLine($"MEDIA = {media}");
    // }
// }