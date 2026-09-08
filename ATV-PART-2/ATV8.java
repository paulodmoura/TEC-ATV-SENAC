import java.util.Scanner;

public class ATV8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLong()) {
            long n = scanner.nextLong();

            if (n <= 1) {
                System.out.println("NAO PRIMO");
            } else {
                boolean isPrimo = true;

                for (long i = 2; i * i <= n; i++) {
                    
                    if (n % i == 0) {
                        isPrimo = false;
                        break; 
                    }
                }

                if (isPrimo) {
                    System.out.println("PRIMO");
                } else {
                    System.out.println("NAO PRIMO");
                }
            }
        }

        scanner.close();
    }
}