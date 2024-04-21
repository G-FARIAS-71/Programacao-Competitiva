import "dart:io";

main() {
  stdin.readLineSync();

  double salario_fixo = double.parse(stdin.readLineSync()!);
  double receita_vendas = double.parse(stdin.readLineSync()!);

  String total = (salario_fixo + 0.15 * receita_vendas).toStringAsFixed(2);

  print("TOTAL = R\$ $total");
}