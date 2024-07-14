import Bank.Banco;
import Client.Cliente;
import Contas.Conta;
import Contas.contaCorrente;
import Contas.contaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente junior = new Cliente("Junior",00200300112);
        Cliente breno = new Cliente("Breno",1453360112);
        Cliente josefa = new Cliente("Josefa",00500360112);
        Cliente adalberto = new Cliente("Adalberto",00500666122);
        Banco Digital = new Banco();

        Conta ccJunior = new contaCorrente(junior);
        Conta poupancaBreno = new contaPoupanca(breno);
        ccJunior.depositar(100);
        ccJunior.transferir(100, poupancaBreno);

        ccJunior.exibirExtrato();
        poupancaBreno.exibirExtrato();
        poupancaBreno.exibirExtrato();
        poupancaBreno.exibirExtrato();

        Digital.adicionarContaCorrente(junior);
        Digital.adicionarContaPoupanca(breno);
        Digital.adicionarContaPoupanca(josefa);
        Digital.adicionarContaCorrente(adalberto);


        Digital.exibirContas();
        ccJunior.getCliente();
        Digital.removerConta("Junior");
        Digital.removerConta("Adalberto");
        System.out.println("=========");
        Digital.exibirContas();

    }
}
