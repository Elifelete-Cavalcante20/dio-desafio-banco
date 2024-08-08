package main;

import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente Elifelete = new Cliente();
        Elifelete.setNome("Elifelete");

        Conta corrente = new ContaCorrente(Elifelete);  
        corrente.depositar((double)100);

        Conta poupanca = new ContaPoupanca(Elifelete);
        corrente.transferir((double)50, poupanca);
        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
