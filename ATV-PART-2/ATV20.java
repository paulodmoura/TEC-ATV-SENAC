import java.util.Scanner;
import java.util.Locale;

public class ATV20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            String titular = scanner.next();
            double saldoInicial = scanner.nextDouble();

            ContaBancaria conta = new ContaBancaria(numero, titular, saldoInicial);

            int q = scanner.nextInt();

            for (int i = 0; i < q; i++) {
                char operacao = scanner.next().charAt(0);
                double valor = scanner.nextDouble();

                if (operacao == 'D') {
                    conta.depositar(valor);
                } else if (operacao == 'S') {
                    boolean sucesso = conta.sacar(valor);
                    if (!sucesso) {
                        System.out.println("SAQUE RECUSADO");
                    }
                }
            }

            System.out.printf(Locale.US, "Conta %d (%s): Saldo Final = R$ %.2f\n", 
                              conta.getNumero(), conta.getTitular(), conta.getSaldo());
        }

        scanner.close();
    }
}

class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true; 
        }
        return false; 
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }
}