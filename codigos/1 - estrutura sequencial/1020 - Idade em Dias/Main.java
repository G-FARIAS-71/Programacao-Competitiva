import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dias = new Scanner(System.in).nextInt();
        int[] valores_tempos = {365, 30, 1};
        String[] tempos = {"ano(s)", "mes(es)", "dia(s)"};
        for (int i = 0; i < 3; i++) {
            int valor_tempo_temp;
            if (dias >= valores_tempos[i]){
                valor_tempo_temp = dias/valores_tempos[i];
                System.out.println(valor_tempo_temp + " " + tempos[i]);
                dias -= valor_tempo_temp * valores_tempos[i];
            } else {
                valor_tempo_temp = 0;
                System.out.println(valor_tempo_temp + " " + tempos[i]);
            }
        }
    }
}