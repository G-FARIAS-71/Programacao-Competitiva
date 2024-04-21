import 'dart:io';

String calcular_media(double A, double B){
  double media = (3.5 * A + 7.5 * B) / 11.0;
  return media.toStringAsFixed(5);
}

main(){
  double A = double.parse(stdin.readLineSync()!);
  double B = double.parse(stdin.readLineSync()!);
  String media = calcular_media(A, B);
  print("MEDIA = $media");
}