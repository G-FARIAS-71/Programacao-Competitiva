import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner prompt = new Scanner(System.in);
        double x1 = prompt.nextDouble();
        double y1 = prompt.nextDouble();
        double x2 = prompt.nextDouble();
        double y2 = prompt.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println(String.format("%.4f", distancia));
    }
}