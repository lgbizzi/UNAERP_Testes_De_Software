package classes;

public class Cliente{
    private Conta conta;
    private String nome;

    public Cliente(Conta conta, String nome){
        super();
        this.conta = conta;
        this.nome = nome;
    }

    public void setConta(Conta conta){
        this.conta = conta;
    }

    public Conta getConta(){
        return this.conta;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}