import 'dart:io';
import 'dart:math';

double PI = 3.14159;

double calcular_area(double raio){
  return PI * pow(raio, 2);
}

main(){
  double raio = double.parse(stdin.readLineSync()!);
  String area = calcular_area(raio).toStringAsFixed(4);
  print("A=$area");
}