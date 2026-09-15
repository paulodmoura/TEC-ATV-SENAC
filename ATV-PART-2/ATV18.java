import java.util.Scanner;
import java.util.Locale;

public class ATV18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        if (scanner.hasNextInt()) {
            int k = scanner.nextInt();

            if (k == 2) {
                double n1 = scanner.nextDouble();
                double n2 = scanner.nextDouble();
                System.out.printf(Locale.US, "Media Calculada: %.2f\n", calcularMedia(n1, n2));
                
            } else if (k == 3) {
                double n1 = scanner.nextDouble();
                double n2 = scanner.nextDouble();
                double n3 = scanner.nextDouble();
                System.out.printf(Locale.US, "Media Calculada: %.2f\n", calcularMedia(n1, n2, n3));
                
            } else if (k == 5) {
                double[] notas = new double[5];
                for (int i = 0; i < 5; i++) {
                    notas[i] = scanner.nextDouble();
                }
                System.out.printf(Locale.US, "Media Calculada: %.2f\n", calcularMedia(notas));
            }
        }
        
        scanner.close();
    }

    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2.0;
    }

    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}