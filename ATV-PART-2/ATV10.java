import java.util.Scanner;

public class ATV10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            int[] vetor = new int[n];
            
            for (int i = 0; i < n; i++) {
                vetor[i] = scanner.nextInt();
            }

            int menor = vetor[0];
            int posMenor = 0;
            
            int maior = vetor[0];
            int posMaior = 0;

            for (int i = 1; i < n; i++) {
                

                if (vetor[i] < menor) {
                    menor = vetor[i];
                    posMenor = i; 
                }
                
                if (vetor[i] > maior) {
                    maior = vetor[i];
                    posMaior = i;
                }
            }

            // Exibe os resultados
            System.out.println("Menor: " + menor + " na posicao " + posMenor);
            System.out.println("Maior: " + maior + " na posicao " + posMaior);
        }

        scanner.close();
    }
}