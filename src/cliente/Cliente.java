package cliente;

import conta.Conta;
import java.util.List;


public class Cliente{
    public String nome;
    public List<Conta> contas;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Conta> getContas (){
        return contas;
    }

    public void setContas(List<Conta> contas){
        this.contas = contas;
    }
    @Override
    public String toString(){
        return nome;
    }
    
}
    
