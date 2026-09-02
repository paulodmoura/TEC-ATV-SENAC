import java.util.Locale;
import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        long centavos = sc.nextLong();
        double taxaPercentual = sc.nextDouble();
        
        double valorBruto = centavos / 100.0;
        double taxaAplicada = valorBruto * (taxaPercentual / 100.0);
        double valorLiquido = valorBruto - taxaAplicada;
        
        System.out.printf(Locale.US, "VALOR BRUTO: R$ %.2f | TAXA APLICADA: R$ %.2f | VALOR LIQUIDO: R$ %.2f\n", 
            valorBruto, taxaAplicada, valorLiquido);
        
        sc.close();
    }
}
