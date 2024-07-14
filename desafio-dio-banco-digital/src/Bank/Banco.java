package Bank;

import Client.Cliente;
import Contas.Conta;
import Contas.contaCorrente;
import Contas.contaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<Conta> contaList;

    public Banco() {
        this.contaList = new ArrayList<>();
    }

    public void adicionarContaPoupanca(Cliente Cliente) {

        contaList.add(new contaPoupanca(Cliente));
    }

    public void adicionarContaCorrente(Cliente Cliente) {

        contaList.add(new contaCorrente(Cliente));
    }

    public void removerConta(String cliente) {
        List<Conta> contaRemover = new ArrayList<>();
        if (!contaList.isEmpty()) {
            for (Conta c : contaList) {
                if (c.getCliente().equalsIgnoreCase(cliente)) {
                    contaRemover.add(c);
                }
            }
            contaList.removeAll(contaRemover);
        }
        else{
            throw new RuntimeException("Nao ha Contas Cadastradas.");
        }
    }

    public void exibirContas() {
        if (!contaList.isEmpty()) {
            for (Conta c : contaList) {
                System.out.println(c);
            }
        } else {
            throw new RuntimeException("Nao ha Contas Cadastradas.");
        }

    }
}