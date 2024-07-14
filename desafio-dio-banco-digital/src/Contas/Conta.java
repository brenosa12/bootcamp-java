package Contas;

import Client.Cliente;

import java.util.Random;

public abstract class Conta {

        protected Random numero = new Random();
        protected int agencia = numero.nextInt(100); ;
        protected int digito = numero.nextInt(9);
        protected double saldo = 0.0;
        protected Cliente cliente;

        public Conta(Cliente Cliente) {
            this.agencia = agencia++;
            this.digito = digito;
            this.cliente = Cliente;
        }

    public String getCliente() {
        return cliente.getNome();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void sacar(double valor) {
            saldo -= valor;
        }

        public void depositar(double valor) {
            saldo += valor;
        }

        public void transferir(double valor, Conta contaDestino) {
            sacar(valor);
            contaDestino.depositar(valor);
        }

        public void exibirExtrato(){
            System.out.println("***** EXTRATO BANCARIO *****");
            System.out.println("Cliente: "+ cliente.getNome());
            System.out.println(("Conta: "  + this.agencia + "-" + this.digito));
            System.out.println(("Saldo: " + this.saldo));
        }

    @Override
    public String toString() {
        return "Conta{ " +
                "Cliente= " + cliente +
                ", Conta= " + agencia + " - " + digito +

                '}';
    }
}




