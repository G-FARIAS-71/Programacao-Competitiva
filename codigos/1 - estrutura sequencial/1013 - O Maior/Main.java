import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int maior = Math.max(Math.max(prompt.nextInt(), prompt.nextInt()), prompt.nextInt());
        System.out.println(maior + " eh o maior");
    }
}