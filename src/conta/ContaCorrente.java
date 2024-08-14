package conta;

import cliente.Cliente;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    

    //Método comum para imprimir informações de conta poupanca
    @Override
    public void imprimirExtrato(){
        System.out.println(" === Extrato de Conta Corrente === ");
        imprimirInfo();
    }

}
