import "dart:io";

main() {
  int number = int.parse(stdin.readLineSync()!);
  int horas = int.parse(stdin.readLineSync()!);
  double salario_hora = double.parse(stdin.readLineSync()!);

  String salario_total = (horas * salario_hora).toStringAsFixed(2);

  print("NUMBER = $number");
  print("SALARY = U\$ $salario_total");
}