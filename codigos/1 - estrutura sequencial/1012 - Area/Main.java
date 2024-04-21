import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static String area_triangulo(double A, double C){
        return String.format("%.3f", A*C/2);
    }
    private static String area_circulo(double C){
        return String.format("%.3f", 3.14159*C*C);
    }
    private static String area_trapezio(double A, double B, double C){
        return String.format("%.3f", (A+B)*C/2);
    }
    private static String area_retangulo(double A, double B){
        return String.format("%.3f", A*B);
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner prompt = new Scanner(System.in);
        double A = prompt.nextDouble();
        double B = prompt.nextDouble();
        double C = prompt.nextDouble();
        System.out.println("TRIANGULO: " + area_triangulo(A, C));
        System.out.println("CIRCULO: " + area_circulo(C));
        System.out.println("TRAPEZIO: " + area_trapezio(A, B, C));
        System.out.println("QUADRADO: " + area_retangulo(B, B));
        System.out.println("RETANGULO: " + area_retangulo(A, B));
    }
}