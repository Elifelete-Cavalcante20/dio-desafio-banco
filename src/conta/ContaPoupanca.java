package conta;

import cliente.Cliente;

public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    //Método comum para imprimir informações de conta poupanca
    @Override
    public void imprimirExtrato(){
        System.out.println(" === Extrato de Conta Poupanca === ");
        imprimirInfo();
    }
}
