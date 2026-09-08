import java.util.Scanner;

public class ATV4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int mes = scanner.nextInt();
            int ano = scanner.nextInt();


            boolean isBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

            if (isBissexto) {
                System.out.println("Ano Bissexto: SIM");
            } else {
                System.out.println("Ano Bissexto: NAO");
            }

            int dias = 0;
            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dias = 31;
                    break;

                case 4: case 6: case 9: case 11:
                    dias = 30;
                    break;

                case 2:
                    if (isBissexto) {
                        dias = 29;
                    } else {
                        dias = 28;
                    }
                    break;
            }

            System.out.println("Dias no Mes: " + dias);
        }

        scanner.close();
    }
}