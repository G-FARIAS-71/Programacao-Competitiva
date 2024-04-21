import 'dart:io';

main(){
  int A = int.parse(stdin.readLineSync()!);
  int B = int.parse(stdin.readLineSync()!);
  int prod = A * B;
  print("PROD = $prod");
}