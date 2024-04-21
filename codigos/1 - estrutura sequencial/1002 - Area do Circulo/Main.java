import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static String getArea(double raio){
        double area = raio * raio * 3.14159;
        return String.format("%.4f",area);
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner prompt = new Scanner(System.in);
        double raio = prompt.nextDouble();
        System.out.println("A=" + getArea(raio));
    }
}