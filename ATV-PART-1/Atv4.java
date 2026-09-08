import java.util.Scanner;
import java.util.Locale;

public class Atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        double x = sc.nextDouble();
        
        int parteInteira = (int) x;
        double parteFracionaria = x - parteInteira;
        
        System.out.printf(Locale.US, "VALOR ORIGINAL: %.4f | PARTE INTEIRA: %d | PARTE FRACIONARIA: %.4f\n", x, parteInteira, parteFracionaria);
        
        sc.close();
    }
}