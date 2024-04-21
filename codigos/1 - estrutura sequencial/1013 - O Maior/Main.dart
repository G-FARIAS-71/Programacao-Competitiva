import 'dart:io';
import 'dart:math';

main(){
  List<String> entrada = stdin.readLineSync()!.split(' ');

  int A = int.parse(entrada[0]);
  int B = int.parse(entrada[1]);
  int C = int.parse(entrada[2]);

  int maior = max(max(A,B),C);

  stdout.writeln("$maior eh o maior");
}