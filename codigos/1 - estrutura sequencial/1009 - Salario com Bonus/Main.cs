using System; 

// class URI {
    // static void Main(string[] args) {
            Console.ReadLine();

            double salario_fixo = double.Parse(Console.ReadLine());
            double receita_vendas = double.Parse(Console.ReadLine());

            string total = Math.Round(salario_fixo + 0.15 * receita_vendas, 2).ToString("F2");

            Console.WriteLine($"TOTAL = R$ {total}");
    // }
// }