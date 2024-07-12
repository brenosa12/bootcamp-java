package Contas;

import Cliente.pessoa;
    public abstract class conta {

        protected int agencia;
        protected int numero;
        protected double saldo;
        protected pessoa cliente;

        public conta(int agencia, int numero, double saldo, pessoa Cliente) {
            this.agencia = agencia;
            this.numero = numero;
            this.saldo = saldo;
            this.cliente = Cliente;
        }

        public void sacar(double valor) {
            saldo -= valor;
        }

        public void depositar(double valor) {
            saldo += valor;
        }

        public void transferir(double valor, conta contaDestino) {
            sacar(valor);
            contaDestino.depositar(valor);
        }

    }




