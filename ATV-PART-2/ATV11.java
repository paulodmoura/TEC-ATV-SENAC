import java.util.Scanner;

public class ATV11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] vetor = new int[n];

            for (int i = 0; i < n; i++) {
                vetor[i] = scanner.nextInt();
            }

            for (int i = 0; i < n / 2; i++) {
                int temp = vetor[i];
                
                vetor[i] = vetor[n - 1 - i];
                
                vetor[n - 1 - i] = temp;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(vetor[i]);
                if (i < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}