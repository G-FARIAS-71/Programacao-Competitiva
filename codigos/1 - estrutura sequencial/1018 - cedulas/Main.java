import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valor = new Scanner(System.in).nextInt();
        System.out.println(valor);
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        for (int cedula:cedulas) {
            int qntd_cedulas_temp;
            if (valor >= cedula){
                qntd_cedulas_temp = valor/cedula;
                System.out.println(qntd_cedulas_temp + " nota(s) de R$ " + cedula + ",00");
                valor -= qntd_cedulas_temp * cedula;
            } else {
                qntd_cedulas_temp = 0;
                System.out.println(qntd_cedulas_temp + " nota(s) de R$ " + cedula + ",00");
            }
        }
    }
}