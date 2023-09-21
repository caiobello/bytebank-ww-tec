public class ContaCorrente {

    private int numeroConta;
    private int numeroAgencia;
    private String nomeDoTitular;
    private String cpfCnpj;
    private double saldo;
    private double limiteChequeEspecial;

    ContaCorrente() {
    }

    public ContaCorrente(int numeroConta, int agencia, String nomeDoTitular, String cpfCnpj) {
        this.numeroConta = numeroConta;
        this.nomeDoTitular = nomeDoTitular;
        this.cpfCnpj = cpfCnpj;
        this.numeroAgencia = agencia;
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= this.saldo) {
            this.saldo -= valorSaque;
        }
    }

    public void sacar(double valorSaque, String motivoDoSaque) {
        if (valorSaque <= this.saldo) {
            this.saldo -= valorSaque;
        }
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
        }
    }

    public void depositar(double valorDeposito, String motivoDoSaque) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
        }
    }

    public void transferir(ContaCorrente contaDestino, double valorTransferencia) {
        if (valorTransferencia <= 0) {
            throw new IllegalArgumentException("O valor da transferência está inválido. O valor deve ser positivo.");
        }
        if (this.saldo < valorTransferencia) {
            throw new IllegalArgumentException("Saldo Insuficiente");
        }
        this.saldo -= valorTransferencia;
        contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferencia);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}

