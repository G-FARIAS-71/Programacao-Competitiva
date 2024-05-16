import 'dart:io';

bool validade(int A, int B, int C, int D){
    return 
        B > C && 
        D > A && 
        C+D > A+B && 
        C > 0 && 
        D > 0 &&
        A % 2 == 0;
}

main(){
  List<int> numeros = stdin.readLineSync()!.split(' ').map((x) => int.parse(x)).toList();
  
  int A = numeros[0];
  int B = numeros[1];
  int C = numeros[2];
  int D = numeros[3];

  bool eh_valido = validade(A,B,C,D);

  if (eh_valido) stdout.writeln("Valores aceitos");
  else stdout.writeln("Valores nao aceitos");
}