package main;

import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
<<<<<<< HEAD
import conta.ContaInvestimentos;
import java.util.ArrayList;
import java.util.List;
=======
import conta.ContaPoupanca;
>>>>>>> f10748a7002fda4bea3362ee80a46a16e420cf00

public class Main {
    public static void main(String[] args) {
        Cliente Elifelete = new Cliente();
        Elifelete.setNome("Elifelete");

        Conta corrente = new ContaCorrente(Elifelete);  
        corrente.depositar((double)100);

<<<<<<< HEAD
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

=======
        Conta poupanca = new ContaPoupanca(Elifelete);
        corrente.transferir((double)50, poupanca);
        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
>>>>>>> f10748a7002fda4bea3362ee80a46a16e420cf00
}
