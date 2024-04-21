import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner prompt = new Scanner(System.in);
        prompt.next();
        double valor = prompt.nextInt() * prompt.nextDouble();
        prompt.next();
        valor += prompt.nextInt() * prompt.nextDouble();
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valor));
    }
}