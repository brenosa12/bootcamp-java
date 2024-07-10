package Contas;

public class contaCorrente implements conta {
    private final String agencia;
    private final int numero;
    public double saldo;

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public contaCorrente(String agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, conta contaDestino) {

    }
}
