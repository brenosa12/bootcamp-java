package Contas;

import Client.Cliente;

public class contaPoupanca extends Conta {
    private int consultas = 0;
    private static final double rendimento = 0.1;
    public contaPoupanca(Cliente Cliente) {
        super( Cliente);
    }

    @Override
    public void exibirExtrato() {
        if ((consultas < 5)){
            consultas++;
        }
        else if (consultas == 5){
            saldo += saldo * rendimento;
            consultas = 0;
        }

        super.exibirExtrato();
    }
}
