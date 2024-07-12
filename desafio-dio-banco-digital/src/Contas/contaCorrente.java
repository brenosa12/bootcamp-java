package Contas;

import Cliente.pessoa;

public class contaCorrente extends conta {


    public contaCorrente(int agencia, int numero, double saldo, pessoa Cliente) {
        super(agencia, numero, saldo, Cliente);
    }

    @Override
    public void transferir(double valor, conta contaDestino) {
        super.transferir(valor, contaDestino);
    }
}
