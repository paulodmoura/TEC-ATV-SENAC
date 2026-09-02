import java.util.Locale;
import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int codigo = sc.nextInt();
            sc.nextLine();
            String descricao = sc.nextLine();
            
            System.out.println("[PRODUTO " + codigo + "] " + descricao);
        }
        
        sc.close();
    }
}
