import java.util.Scanner;

public class Atv6 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int v = scanner.nextInt();
            
            short castShort = (short) v;
            byte castByte = (byte) v;
            
            System.out.printf("INT: %d | CAST SHORT: %d | CAST BYTE: %d%n", v, castShort, castByte);
        
        }
        scanner.close();
    }

}