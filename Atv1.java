import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();
        int ano = scanner.nextInt();

        System.out.println("Bem-vindo ao Java, " + nome + "! Compilado com javac e executado na JVM em " + ano + ".");

        scanner.close();
    }
}