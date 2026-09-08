import java.util.Scanner;
import java.util.Locale;

public class ATV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        if (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();
            
            char op = scanner.next().charAt(0);
            
            double b = scanner.nextDouble();

            switch (op) {
                case '+':
                    System.out.printf(Locale.US, "Resultado: %.2f\n", (a + b));
                    break;
                case '-':
                    System.out.printf(Locale.US, "Resultado: %.2f\n", (a - b));
                    break;
                case '*':
                    System.out.printf(Locale.US, "Resultado: %.2f\n", (a * b));
                    break;
                case '/':
                    if (b == 0.0) {
                        System.out.println("ERRO: Divisao por zero");
                    } else {
                        System.out.printf(Locale.US, "Resultado: %.2f\n", (a / b));
                    }
                    break;
                default:
                    System.out.println("ERRO: Operador invalido");
                    break;
            }
        }
        
        scanner.close();
    }
}