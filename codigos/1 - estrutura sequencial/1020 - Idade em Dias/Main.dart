import 'dart:io';

main(){
  int total = int.parse(stdin.readLineSync()!);
  
  int anos = total ~/ 365;
  int meses = (total - anos * 365) ~/ 30;
  int dias = total - anos * 365 - meses * 30;

  stdout.writeln("$anos ano(s)");
  stdout.writeln("$meses mes(es)");
  stdout.writeln("$dias dia(s)");
}