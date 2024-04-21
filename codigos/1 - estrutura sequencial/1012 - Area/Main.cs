using System; 
using static System.Console;

// class URI {
    static double PI = 3.14159;

    static string triangulo(double A, double C){
        double area = A*C/2.0;
        return Math.Round(area, 3).ToString("F3");
    }

    static string circulo(double C){
        double area = PI * Math.Pow(C, 2);
        return Math.Round(area, 3).ToString("F3");
    }

    static string trapezio(double A, double B, double C){
        double area = (A+B)*C/2.0;
        return Math.Round(area, 3).ToString("F3");
    }

    static string retangulo(double X, double Y){
        double area = X*Y;
        return Math.Round(area, 3).ToString("F3");
    }

    static void exibirSaidas(double[] valores){
        double A = valores[0];
        double B = valores[1];
        double C = valores[2];

        WriteLine($"TRIANGULO: {triangulo(A,C)}");
        WriteLine($"CIRCULO: {circulo(C)}");
        WriteLine($"TRAPEZIO: {trapezio(A,B,C)}");
        WriteLine($"QUADRADO: {retangulo(B,B)}");
        WriteLine($"RETANGULO: {retangulo(A,B)}");
    }
    // static void Main(string[] args) { 
        string[] linha = ReadLine().Split(' ');
        double[] valores = Array.ConvertAll(linha, x => double.Parse(x));
        exibirSaidas(valores);
    // }
// }