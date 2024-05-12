import 'dart:io';

main(){
  int valor = int.parse(stdin.readLineSync()!);
  stdout.writeln(valor);

  List<int> cedulas = [100, 50, 20, 10, 5, 2, 1];

  for (int i = 0; i < cedulas.length; i++){
    int cedula = cedulas[i];
    int qntd = (valor/cedula).floor();
    valor -= qntd*cedula;
    print("$qntd nota(s) de R\$ $cedula,00");
  }
}