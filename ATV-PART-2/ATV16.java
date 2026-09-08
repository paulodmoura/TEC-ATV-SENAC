import java.util.Scanner;

public class ATV16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int l = scanner.nextInt();
            int c = scanner.nextInt();

            int[][] matriz = new int[l][c];

            for (int i = 0; i < l; i++) {
                for (int j = 0; j < c; j++) {
                    matriz[i][j] = scanner.nextInt();
                }
            }


            for (int j = 0; j < c; j++) {
                for (int i = 0; i < l; i++) {
                    System.out.print(matriz[i][j]);
                    
                    if (i < l - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}