import java.util.Scanner;
import java.util.Locale;

public class ATV19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                double largura = scanner.nextDouble();
                double altura = scanner.nextDouble();

                Retangulo ret = new Retangulo(largura, altura);

                System.out.printf(Locale.US, "Retangulo %d: Area = %.2f, Perimetro = %.2f\n", 
                                  i, ret.calcularArea(), ret.calcularPerimetro());
            }
        }

        scanner.close();
    }
}

class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

    public double calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }
}