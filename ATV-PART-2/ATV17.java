import java.util.Scanner;

public class ATV17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("MDC: " + mdc(a, b) + ", MMC: " + mmc(a, b));
        }

        scanner.close();
    }

    public static int mdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public static long mmc(int a, int b) {
        return ((long) a * b) / mdc(a, b); 
    }
}