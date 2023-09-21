import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(111, 1, "Luan Rosa", "123.456.789-00");
        ContaCorrente conta2 = new ContaCorrente(222, 1, "Maria Peralta", "987.654.321-00");
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saldo inicial da conta 1: " + conta1.getSaldo());

        conta1.setSaldo(1000.0);
        System.out.println("Novo saldo da conta 1 após setar o saldo: " + decimalFormat.format(conta1.getSaldo()));
        conta1.depositar(200);
        System.out.println("Novo saldo da conta 1 após depositar mais saldo: " + decimalFormat.format(conta1.getSaldo()));
        conta1.sacar(100);
        System.out.println("Novo saldo da conta 1 após sacar saldo: " + decimalFormat.format(conta1.getSaldo()));


        System.out.println("\nSaldo da inicial conta 2: " + decimalFormat.format(conta2.getSaldo()));
        conta2.setSaldo(500.0);
        System.out.println("Novo saldo da conta 2 após setar o saldo: " + decimalFormat.format(conta2.getSaldo()));

        System.out.println("Digite o valor da transferencia da Conta 1, para Conta 2: ");
        double valorTransferencia = scanner.nextDouble();


        conta1.transferir(conta2, valorTransferencia);
        System.out.println("\nTransferência da conta 1 de R$" + valorTransferencia + " para conta2 numero: " + conta2.getNumeroConta());
        System.out.println("Saldo atual da conta 1 após transferência: " + decimalFormat.format(conta1.getSaldo()));
        System.out.println("Saldo atual da conta 2 após recebimento de transferência: " + decimalFormat.format(conta2.getSaldo()));


        System.out.println("\nInformações da conta 1:");
        System.out.println("Número da Conta: " + conta1.getNumeroConta());
        System.out.println("Nome do Titular: " + conta1.getNomeDoTitular());
        System.out.println("CPF/CNPJ: " + conta1.getCpfCnpj());
        System.out.println("Saldo: " + decimalFormat.format(conta1.getSaldo()));

        System.out.println("\nInformações da conta 2:");
        System.out.println("Número da Conta: " + conta2.getNumeroConta());
        System.out.println("Nome do Titular: " + conta2.getNomeDoTitular());
        System.out.println("CPF/CNPJ: " + conta2.getCpfCnpj());
        System.out.println("Saldo: " + decimalFormat.format(conta2.getSaldo()));


        /*
        conta1.transferir(conta2, -100);
        */

        /*
        conta1.transferir(conta2, 10000);
        */
    }
}
