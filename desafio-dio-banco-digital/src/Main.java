import Bank.Banco;
import Client.Cliente;
import Contas.Conta;
import Contas.contaCorrente;
import Contas.contaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente("venilton",00200300112);
        Cliente Breno = new Cliente("Breno",1453360112);
        Cliente Josefa = new Cliente("Josefa",00500360112);
        Banco Digital = new Banco();

        Conta cc = new contaCorrente(venilton);
        Conta poupanca = new contaPoupanca(Breno);
        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.exibirExtrato();
        poupanca.exibirExtrato();


        Digital.adicionarContaCorrente(venilton);
        Digital.adicionarContaPoupanca(Breno);
        Digital.exibirContas();
        cc.getCliente();
        Digital.removerConta("venilton");
        System.out.println("=========");
        Digital.exibirContas();

    }
}
