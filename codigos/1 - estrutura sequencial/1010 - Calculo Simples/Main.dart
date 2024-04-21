import 'dart:io';

List<double> ler_entrada(){
  return stdin
          .readLineSync()!
          .split(" ")
          .sublist(1)
          .map((x) => double.parse(x))
          .toList();
}

double prod(List<double> valores){
  return valores.reduce((acc, n) => acc * n);
}

double calculo(List<double> valores1, List<double> valores2){
  return prod(valores1) + prod(valores2);
}

main(){
  List<double> valores1 = ler_entrada();
  List<double> valores2 = ler_entrada();

  String total = calculo(valores1, valores2).toStringAsFixed(2);

  print("VALOR A PAGAR: R\$ $total");
}