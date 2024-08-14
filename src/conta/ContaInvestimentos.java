package conta;

import cliente.Cliente;

public class ContaInvestimentos extends Conta {
    public ContaInvestimentos(Cliente cliente) {
        super(cliente);
    }

    //Método para imprimir informações da conta.
    @Override
    public void imprimirExtrato() {
        System.out.println(" === Extrato de Conta de Investimentos === ");
        imprimirInfo();
        System.out.println(" Taxa de rendimento: 5%");
        calcularRendimento(saldo);
    }
    

}
