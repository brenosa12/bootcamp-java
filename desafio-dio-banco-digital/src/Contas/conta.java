package Contas;

interface conta {

    public void sacar(double valor);

    public void depositar(double valor);
    public void transferir(double valor, conta contaDestino);

}
