import java.util.Scanner;

public class ATV7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pontos = 0;
        int opcao = 0;

        if (scanner.hasNextInt()) {
            do {
                opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1:
                        pontos += 10;
                        break;
                    case 2:
                        if (pontos >= 5) {
                            pontos -= 5;
                        }
                        break;
                    case 3:
                        pontos *= 2;
                        break;
                    case 0:
                        break;
                }
            } while (opcao != 0);

            System.out.println("Pontos Finais: " + pontos);
        }
        
        scanner.close();
    }
}