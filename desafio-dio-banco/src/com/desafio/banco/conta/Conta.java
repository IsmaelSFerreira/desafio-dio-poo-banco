package com.desafio.banco.conta;

import com.desafio.banco.cliente.Cliente;

public class Conta implements IConta{

	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;

    
    public Conta(int agencia, int numeroConta, double saldo, Cliente cliente) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void imprimirInfos(){
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Agência: "+ this.agencia);
        System.out.println("Número: "+ this.numeroConta);
        System.out.println("Saldo: "+ this.saldo);
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        // TODO Auto-generated method stub
        sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        this.saldo -= valor;
    }
    
}
