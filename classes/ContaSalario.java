package classes;

public final class ContaSalario extends Conta{
    public ContaSalario(Cliente cliente, int agencia, int numero, double saldo, double limite){
        super(cliente, agencia, numero, saldo, limite);
    }
}