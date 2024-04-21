using System;

// class URI {

    static double[] ler_entrada(){
        string[] linha = Console.ReadLine().Split(' ');
        double[] valores = Array.ConvertAll(linha, x => double.Parse(x));
        return valores;
    }

    static double calculo(double q1, double v1, double q2, double v2){
        return q1*v1 + q2*v2;
    }

    static string get_calculo(double[] valores1, double[] valores2){
        return calculo(valores1[1], valores1[2], valores2[1], valores2[2]).ToString("F2");
    }

    // static void Main(string[] args) {
            double[] valores1 = ler_entrada();
            double[] valores2 = ler_entrada();
            string total = get_calculo(valores1, valores2);
            Console.WriteLine($"VALOR A PAGAR: R$ {total}");
    // }
// }