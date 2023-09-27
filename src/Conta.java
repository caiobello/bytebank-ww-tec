public abstract class Conta {
    private int numeroConta;
    private int numeroAgencia;
    private String nomeDoTitular;
    private String cpfCnpj;
    private double saldo;

    Conta(int numeroConta, int numeroAgencia, String nomeDoTitular, String cpfCnpj) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nomeDoTitular = nomeDoTitular;
        this.cpfCnpj = cpfCnpj;
        this.saldo = 0;
    }

    Conta(){
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

    public abstract void sacar(double valorSaque);

    public abstract void sacar(double valorSaque, String motivoDoSaque) throws IllegalArgumentException;

    public abstract void depositar(double valorDeposito);

    public abstract void depositar(double valorDeposito, String motivoDoDeposito) throws IllegalArgumentException;

    public abstract void transferir(ContaCorrente contaDestino, double valorTransferencia);

    public abstract void transferir(ContaPoupanca contaDestino, double valorTransferencia);
}