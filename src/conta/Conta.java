package conta;

import cliente.Cliente;

public class Conta implements IConta{
    
    public static final int AGENCIA_PADRAO = 0021;
    public static int SEQUENCIAL = 3467;

    protected double taxaDeRendimento = 0.05;
    public int agencia;
    public int numero;
    public double saldo;
    public  Cliente cliente;

    //Todos '@override' são caracteristicas herdadas da interface IConta.
    @Override
    public void sacar(Double valor){
        saldo -= valor;
    }
    @Override
    public void depositar(Double valor){
        saldo += valor;
    }
    @Override
    public void transferir(Double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    @Override
    public void imprimirExtrato() {
       
    }

    //Getters padrão para exibição de dados simples da conta bancária.
    public int getAgencia(){
        return agencia;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }
    
    //Gerador de contas padrão: 
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero  = SEQUENCIAL++;
        this.cliente = cliente;
    }

    //Impressão de dados da conta bancária.
    protected void imprimirInfo(){
        System.out.println(String.format(" Agencia: %d", this.agencia));
        System.out.println(String.format(" Numero: %d", this.numero));
        System.out.println(String.format(" Titular: %s", this.cliente));
        System.out.println(String.format(" Saldo: %.2f", this.saldo));
    }

    public void calcularRendimento(Double valor){
        saldo = valor *= taxaDeRendimento;
        System.out.println(String.format(" Rendimento estimado: %.2f", this.saldo));
    }

}
