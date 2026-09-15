import java.util.Scanner;

public class ATV13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            return;
        }
        
        int n = scanner.nextInt();
        int[] v = new int[n];
        
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        
        int positivos = 0;
        int somaPares = 0;
        
        for (int x : v) {
            if (x > 0) {
                positivos++;
            }
            if (x % 2 == 0) {
                somaPares += x;
            }
        }
        
        System.out.println("Positivos: " + positivos);
        System.out.println("Soma dos Pares: " + somaPares);
        
        scanner.close();
    }
}