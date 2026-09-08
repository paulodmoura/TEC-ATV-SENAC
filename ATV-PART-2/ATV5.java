import java.util.Scanner;

public class ATV5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            int somatorio = 0;
            long fatorial = 1; 

            for (int i = 1; i <= n; i++) {
                somatorio += i; 
                fatorial *= i; 
            }

            System.out.println("Somatorio: " + somatorio);
            System.out.println("Fatorial: " + fatorial);
        }

        scanner.close();
    }
}