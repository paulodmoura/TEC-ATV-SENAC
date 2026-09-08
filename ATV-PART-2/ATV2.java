import java.util.Scanner;
import java.util.Locale;

public class ATV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        if (scanner.hasNextDouble()) {
            double salarioBruto = scanner.nextDouble();
            double taxaDeDesconto = 0.0;

            if (salarioBruto <= 2000.00) {
                taxaDeDesconto = 0.0; // 0%
            } else if (salarioBruto <= 3500.00) {
                taxaDeDesconto = 0.075; // 7.5%
            } else if (salarioBruto <= 5000.00) {
                taxaDeDesconto = 0.15; // 15.0%
            } else {
                taxaDeDesconto = 0.225; // 22.5%
            }

            double desconto = salarioBruto * taxaDeDesconto;
            double salarioLiquido = salarioBruto - desconto;

            System.out.printf(Locale.US, "Desconto IR: R$ %.2f\n", desconto);
            System.out.printf(Locale.US, "Salario Liquido: R$ %.2f\n", salarioLiquido);
        }

        scanner.close();
    }
}