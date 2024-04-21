import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int getDiferenca(int n1, int n2, int n3, int n4){
        return n1*n2 - n3*n4;
    }
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("DIFERENCA = " + getDiferenca(prompt.nextInt(), prompt.nextInt(), prompt.nextInt(), prompt.nextInt()));
    }
}