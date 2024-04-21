import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner prompt = new Scanner(System.in);
        System.out.println("NUMBER = " + (prompt.nextInt()));
        System.out.println("SALARY = U$ " + String.format("%.2f", prompt.nextInt()*prompt.nextDouble()));
    }
}