import java.util.Scanner;

public class ATV15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            return;
        }
        
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];
        
        int principal = 0;
        int secundaria = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
                if (i == j) {
                    principal += matriz[i][j];
                }
                if (j == n - 1 - i) {
                    secundaria += matriz[i][j];
                }
            }
        }
        
        int diferencaAbsoluta = Math.abs(principal - secundaria);
        
        System.out.println("Principal: " + principal);
        System.out.println("Secundaria: " + secundaria);
        System.out.println("Diferenca Absoluta: " + diferencaAbsoluta);
        
        scanner.close();
    }
}