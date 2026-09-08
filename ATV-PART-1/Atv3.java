import java.util.Scanner;
import java.util.Locale;

public class Atv3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int divInteira = a / b;
        double divReal = (double) a / b;
        
        System.out.printf(Locale.US, "DIVISAO INTEIRA: %d | DIVISAO REAL: %.4f\n", divInteira, divReal);
        
        sc.close();
    }
}