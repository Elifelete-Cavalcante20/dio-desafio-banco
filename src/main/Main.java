package main;

import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaInvestimentos;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente Elifelete = new Cliente();
        Elifelete.setNome("Elifelete");

        Conta corrente = new ContaCorrente(Elifelete);  
        corrente.depositar((double)100);

        Conta investimento = new ContaInvestimentos(Elifelete);
        corrente.transferir((double)50, investimento);
        corrente.imprimirExtrato();
        investimento.imprimirExtrato();
        
        //Adicionando contas ao Array: 
        List<Conta> listaContas = new ArrayList<>();
        listaContas.add(corrente);
        listaContas.add(investimento);
        Elifelete.setContas(listaContas);
    }

}
