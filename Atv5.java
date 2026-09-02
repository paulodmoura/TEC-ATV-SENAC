import java.util.Locale;
import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()) {
            String sInt = scanner.next();
            String sDouble = scanner.next();
            String sBool = scanner.next();
            
            int numInt = Integer.parseInt(sInt);
            double numDouble = Double.parseDouble(sDouble);
            boolean flag = Boolean.parseBoolean(sBool);
            
            double somaNumerica = numInt + numDouble;
            boolean flagInvertida = !flag;
            
            System.out.printf(Locale.US, "SOMA NUMERICA: %.2f | FLAG INVERTIDA: %b%n", somaNumerica, flagInvertida);
        }
        
        scanner.close();
    }
}
