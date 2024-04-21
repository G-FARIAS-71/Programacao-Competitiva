using System; 

// class URI {
    // static void Main(string[] args) {
            int number = int.Parse(Console.ReadLine());
            int horas = int.Parse(Console.ReadLine());
            double salario_hora = double.Parse(Console.ReadLine());

            string salario_total = Math.Round(horas * salario_hora, 2).ToString("F2");

            Console.WriteLine($"NUMBER = {number}");
            Console.WriteLine($"SALARY = U$ {salario_total}");
    // }
// }