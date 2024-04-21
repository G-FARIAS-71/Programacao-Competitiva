import 'dart:io';
import 'dart:math';

double PI = 3.14159;

double TRIANGULO(double A, double C){
  return A*C/2;
}

double CIRCULO(double C){
  return PI * pow(C, 2);
}

double TRAPEZIO(double A, double B, double C){
  return (A+B)*C/2;
}

double RETANGULO(double X, double Y){
  return X*Y;
}

exibirSaidas(List<double> entrada){
  double A = entrada[0];
  double B = entrada[1];
  double C = entrada[2];

  String triangulo = TRIANGULO(A,C).toStringAsFixed(3);
  String circulo = CIRCULO(C).toStringAsFixed(3);
  String trapezio = TRAPEZIO(A,B,C).toStringAsFixed(3);
  String quadrado = RETANGULO(B,B).toStringAsFixed(3);
  String retangulo = RETANGULO(A,B).toStringAsFixed(3);

  stdout.writeln("TRIANGULO: $triangulo");
  stdout.writeln("CIRCULO: $circulo");
  stdout.writeln("TRAPEZIO: $trapezio");
  stdout.writeln("QUADRADO: $quadrado");
  stdout.writeln("RETANGULO: $retangulo");
}

main(){
  List<double> entrada = stdin
                      .readLineSync()!
                      .split(' ')
                      .map((x) => double.parse(x))
                      .toList();

  exibirSaidas(entrada);
}