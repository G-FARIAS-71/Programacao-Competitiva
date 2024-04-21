import 'dart:io';

main(){
  int A = int.parse(stdin.readLineSync()!);
  double B = double.parse(stdin.readLineSync()!);

  String res = (A/B).toStringAsFixed(3);

  print("$res km/l");
}