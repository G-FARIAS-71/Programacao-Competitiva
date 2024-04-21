import 'dart:io';
import 'dart:math';

double PI = 3.14159;

double calcular_volume(double raio){
  return 4/3.0 * PI * pow(raio, 3);
}

main(){
  double raio = double.parse(stdin.readLineSync()!);
  String volume = calcular_volume(raio).toStringAsFixed(3);
  print("VOLUME = $volume");
}