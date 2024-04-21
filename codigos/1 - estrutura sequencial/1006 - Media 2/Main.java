import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static String getMedia(double n1, double n2, double n3){
        double media = (n1*2 + n2*3 + n3*5)/10;
        return String.format("%.1f", media);
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner prompt = new Scanner(System.in);
        System.out.println("MEDIA = " + getMedia(prompt.nextDouble(), prompt.nextDouble(), prompt.nextDouble()));
    }
}