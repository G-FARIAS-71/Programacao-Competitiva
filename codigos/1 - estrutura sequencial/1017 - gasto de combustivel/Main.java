import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner prompt = new Scanner(System.in);
        int h = prompt.nextInt();
        int kmh = prompt.nextInt();
        String l = String.format("%.3f", (h * kmh / 12.0));
        System.out.println(l);
    }
}