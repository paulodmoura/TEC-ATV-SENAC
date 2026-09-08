import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            
            int[] vetor = new int[n];
            
            for (int i = 0; i < m; i++) {
                int idx = scanner.nextInt();
                int valor = scanner.nextInt();
                vetor[idx] = valor;
            }
            
            int somaTotal = 0;
            
            System.out.print("VETOR JAVA: ");
            
            for (int i = 0; i < n; i++) {
                System.out.print(vetor[i]);
                
                if (i < n - 1) {
                    System.out.print(" ");
                }
                
                somaTotal += vetor[i];
            }
            
            System.out.println(" | SOMA TOTAL: " + somaTotal);
        }
        
        scanner.close();
    }
}

