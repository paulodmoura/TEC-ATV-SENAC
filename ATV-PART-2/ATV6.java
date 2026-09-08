import java.util.Scanner;

public class ATV6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a entrada do usuário
        if (scanner.hasNextLong()) {
            long n = scanner.nextLong();
            
            int passos = 0;
            long maiorValor = n;

            // O laço continua executando ENQUANTO 'n' for diferente de 1
            while (n != 1) {
                
                // Verifica se 'n' é par (resto da divisão por 2 igual a zero)
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    // Se não é par, é ímpar
                    n = (n * 3) + 1;
                }
                
                passos++; // Contabiliza que um passo foi dado
                
                // Se o novo valor de 'n' for o maior até agora, atualiza a variável
                if (n > maiorValor) {
                    maiorValor = n;
                }
            }

            // Imprime o resultado exatamente no formato pedido
            System.out.println("Passos: " + passos + ", Maior Valor: " + maiorValor);
        }

        scanner.close();
    }
}