import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner prompt = new Scanner(System.in);
        prompt.next();
        BigDecimal salario_fixo = prompt.nextBigDecimal();
        BigDecimal percentual_vendas = new BigDecimal("0.15");
        BigDecimal valor_vendas = prompt.nextBigDecimal();
        BigDecimal salario_total = salario_fixo.add(valor_vendas.multiply(percentual_vendas));
        salario_total = salario_total.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("TOTAL = R$ " + salario_total);
    }
}