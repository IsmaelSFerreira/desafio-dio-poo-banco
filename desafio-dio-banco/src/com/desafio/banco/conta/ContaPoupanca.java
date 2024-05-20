package com.desafio.banco.conta;

import com.desafio.banco.cliente.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numeroConta, double saldo, Cliente cliente) {
        super(agencia, numeroConta, saldo, cliente);
        //TODO Auto-generated constructor stub
    }

    public void imprimirExtrato(){
        System.out.println("Extrato conta poupança");
        imprimirInfos();
    }
    
}
