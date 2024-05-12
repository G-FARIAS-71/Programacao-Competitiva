import 'dart:io';

main(){
  int h = int.parse(stdin.readLineSync()!);
  int km = int.parse(stdin.readLineSync()!);

  String gasto = (h * km / 12).toStringAsFixed(3);

  print(gasto);
}