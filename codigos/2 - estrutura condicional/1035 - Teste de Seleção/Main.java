import java.io.IOException;
import java.util.Scanner;
 
public class Main {

    static boolean validade(int A, int B, int C, int D){
        return 
            B > C && 
            D > A && 
            C+D > A+B && 
            C > 0 && 
            D > 0 &&
            A % 2 == 0;
    }
 
    public static void main(String[] args) throws IOException {
 
        Scanner prompt = new Scanner(System.in);

        int A = prompt.nextInt();
        int B = prompt.nextInt();
        int C = prompt.nextInt();
        int D = prompt.nextInt();

        boolean eh_valido = validade(A, B, C, D);

        if (eh_valido) System.out.println("Valores aceitos");
        else System.out.println("Valores nao aceitos");
 
    }
 
}