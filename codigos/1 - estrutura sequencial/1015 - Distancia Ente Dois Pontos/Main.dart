import 'dart:io';
import 'dart:math';

List<double> processar_entrada(){
  return stdin.readLineSync()!.split(' ').map((x) => double.parse(x)).toList();
}

double calcular_distancia(List<double> e1, List<double> e2){
  return sqrt(pow(e2[0] - e1[0], 2) + pow(e2[1] - e1[1], 2));
}

main(){
  String distancia = calcular_distancia(processar_entrada(), processar_entrada()).toStringAsFixed(4);
  print("$distancia");
}