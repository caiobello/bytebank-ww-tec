public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numeroConta, int numeroAgencia, String nomeDoTitular, String cpfCnpj) {
        super(numeroConta, numeroAgencia, nomeDoTitular, cpfCnpj);
    }

    @Override
    public void sacar(double valorSaque) throws IllegalArgumentException {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido. O valor deve ser positivo.");
        }

        if (valorSaque <= getSaldo()) {
            setSaldo(getSaldo() - valorSaque);
        } else {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
    }

    @Override
    public void sacar(double valorSaque, String motivoDoSaque) throws IllegalArgumentException {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido. O valor deve ser positivo.");
        }

        if (valorSaque <= getSaldo()) {
            setSaldo(getSaldo() - valorSaque);
        } else {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
    }

    @Override
    public void depositar(double valorDeposito) throws IllegalArgumentException {
        if (valorDeposito <= 0) {
            throw new IllegalArgumentException("Valor de depósito inválido. O valor deve ser positivo.");
        }
        setSaldo(getSaldo() + valorDeposito);
    }

    @Override
    public void depositar(double valorDeposito, String motivoDoDeposito) throws IllegalArgumentException {
        if (valorDeposito <= 0) {
            throw new IllegalArgumentException("Valor de depósito inválido. O valor deve ser positivo.");
        }
        setSaldo(getSaldo() + valorDeposito);
    }

    @Override
    public void transferir(Conta contaDestino, double valorTransferencia) throws IllegalArgumentException {
        if (valorTransferencia <= 0) {
            throw new IllegalArgumentException("O valor da transferência está inválido. O valor deve ser positivo.");
        }
        if (getSaldo() < valorTransferencia) {
            throw new IllegalArgumentException("Saldo Insuficiente");
        }
        setSaldo(getSaldo() - valorTransferencia);
        contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferencia);

    }

}


