public class ContaCorrente extends Conta {


    private double limiteChequeEspecial = 0;


    ContaCorrente(int numeroConta, int numeroAgencia, String nomeDoTitular, String cpfCnpj, double limiteChequeEspecial) {
        super(numeroConta, numeroAgencia, nomeDoTitular, cpfCnpj);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }


    @Override
    public void sacar(double valorSaque) throws IllegalArgumentException {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido. O valor deve ser positivo.");
        }

        if (valorSaque <= (getSaldo() + limiteChequeEspecial)) {
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

        if (valorSaque <= (getSaldo() + limiteChequeEspecial)) {
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
        if (getSaldo() + limiteChequeEspecial < valorTransferencia) {
            throw new IllegalArgumentException("Saldo Insuficiente");
        }
        setSaldo( getSaldo() - valorTransferencia );
        contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferencia);
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}

