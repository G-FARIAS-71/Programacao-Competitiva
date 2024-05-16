import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int segundos = new Scanner(System.in).nextInt();
        int[] tempos = {3600, 60, 1};
        ArrayList<String> saidas = new ArrayList<>();
        for (int tempo:tempos) {
            int qntd_tempo_temp;
            if (segundos >= tempo){
                qntd_tempo_temp = segundos/tempo;
                saidas.add(String.valueOf(qntd_tempo_temp));
                segundos -= qntd_tempo_temp * tempo;
            } else {
                qntd_tempo_temp = 0;
                saidas.add(String.valueOf(qntd_tempo_temp));
            }
        }
        System.out.println(String.join(":", saidas));
    }
}