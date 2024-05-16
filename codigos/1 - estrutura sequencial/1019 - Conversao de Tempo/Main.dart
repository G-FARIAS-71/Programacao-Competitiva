import 'dart:io';

main(){
  int total = int.parse(stdin.readLineSync()!);
  
  int horas = total ~/ 3600;
  int minutos = (total % 3600) ~/ 60;
  int segundos = total % 60;

  stdout.writeln("$horas:$minutos:$segundos");
}