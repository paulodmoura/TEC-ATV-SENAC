import java.util.Scanner;
import java.util.Locale;

public class Atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String nome = sc.next();
        int idade = sc.nextInt();
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2.0;

        System.out.printf(Locale.US, "ALUNO: %s | IDADE: %d ANOS | MEDIA: %.2f", nome, idade, media);

        sc.close();
    }
}