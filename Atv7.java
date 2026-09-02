import java.util.Scanner;
import java.util.Locale;

public class Atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        char c = sc.next().charAt(0);
        int k = sc.nextInt();
        
        char deslocado = (char) (c + k);
        
        System.out.printf(Locale.US, "CHAR ORIGINAL: '%c' (UNICODE: %d) | DESLOCADO (+%d): '%c' (UNICODE: %d)\n", 
            c, (int) c, k, deslocado, (int) deslocado);
        
        sc.close();
    }
}
