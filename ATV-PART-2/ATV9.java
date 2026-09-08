import java.util.Scanner;

public class ATV9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            int numeroAtual = 1; 

            for (int i = 1; i <= n; i++) {
                
                for (int j = 1; j <= i; j++) {
                    
                    System.out.print(numeroAtual + " ");
                    

                    numeroAtual++;
                }
                
                System.out.println();
            }
        }

        scanner.close();
    }
}