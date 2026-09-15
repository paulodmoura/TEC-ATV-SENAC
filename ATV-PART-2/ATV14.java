import java.util.Scanner;

public class ATV14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            return;
        }
        
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        
        int[][] matriz = new int[l][c];
        int[] somaLinhas = new int[l];
        int[] somaColunas = new int[c];
        
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = scanner.nextInt();
                somaLinhas[i] += matriz[i][j];
                somaColunas[j] += matriz[i][j];
            }
        }
        
        for (int i = 0; i < l; i++) {
            System.out.println("Linha " + i + ": " + somaLinhas[i]);
        }
        
        for (int j = 0; j < c; j++) {
            System.out.println("Coluna " + j + ": " + somaColunas[j]);
        }
        
        scanner.close();
    }
}