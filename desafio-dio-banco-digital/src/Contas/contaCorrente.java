package Contas;

import Client.Cliente;

import java.util.Random;

public class contaCorrente extends Conta {
    private Random chequeEspecial = new Random();
    private int limite = chequeEspecial.nextInt(1500);


    public contaCorrente(Cliente Cliente) {
        super(Cliente);
    }

    public void consultarChequeEspecial(){
        System.out.println(limite);
    }

    @Override
    public void sacar(double valor) {

        if (saldo > 0 & limite > 0) {
            saldo -= valor;
        }
        else {
            System.out.println("Voce nao possui Saldo suficente.");
        }
    }

    @Override
    public void exibirExtrato() {
        super.exibirExtrato();
        System.out.println("Saldo + Cheque Especial: " + (saldo + limite));
    }
}
