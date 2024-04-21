import 'dart:io';

String calcular_media(double A, double B, double C){
  double media = (2 * A + 3 * B + 5 * C) / 10.0;
  return media.toStringAsFixed(1);
}

main(){
  double A = double.parse(stdin.readLineSync()!);
  double B = double.parse(stdin.readLineSync()!);
  double C = double.parse(stdin.readLineSync()!);
  String media = calcular_media(A, B, C);
  print("MEDIA = $media");
}