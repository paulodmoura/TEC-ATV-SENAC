import java.util.Scanner;

public class ATV12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] frequencia = new int[11];

            for (int i = 0; i < n; i++) {
                int nota = scanner.nextInt();
                frequencia[nota]++;
            }

            int moda = -1;
            int maxFrequencia = -1;

            for (int i = 0; i <= 10; i++) {
                System.out.println("Nota " + i + ": " + frequencia[i] + " aluno(s)");
                
                if (frequencia[i] >= maxFrequencia) {
                    maxFrequencia = frequencia[i];
                    moda = i;
                }
            }

            System.out.println("Moda: Nota " + moda);
        }
        
        scanner.close();
    }
}