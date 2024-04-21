using System;
using System.Globalization;

// class URI {
    double calcular_media(double A, double B){
        double media = (3.5 * A + 7.5 * B) / 11;
        return Math.Round(media, 5);
    }
    // static void Main(string[] args) { 
        CultureInfo.CurrentCulture = CultureInfo.CreateSpecificCulture("en-US");
        double A = double.Parse(Console.ReadLine());
        double B = double.Parse(Console.ReadLine());
        string media = calcular_media(A, B).ToString("F5");
        Console.WriteLine($"MEDIA = {media}");
    // }
// }