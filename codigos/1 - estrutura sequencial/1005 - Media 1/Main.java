import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static String getMedia(double n1, double n2){
        double media = (n1*3.5 + n2*7.5)/11;
        return String.format("%.5f", media);
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner prompt = new Scanner(System.in);
        System.out.println("MEDIA = " + getMedia(prompt.nextDouble(), prompt.nextDouble()));
    }
}