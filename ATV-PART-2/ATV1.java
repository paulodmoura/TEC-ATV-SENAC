import java.util.Scanner;

public class ATV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if ((a < b + c) && (b < a + c) && (c < a + b)) {
                
                if (a == b && b == c) {
                    System.out.println("EQUILATERO");
                } else if (a == b || a == c || b == c) {
                    System.out.println("ISOSCELES");
                } else {
                    System.out.println("ESCALENO");
                }
            } else {
                System.out.println("NAO FORMA TRIANGULO");
            }
        }
        
        scanner.close();
    }
}