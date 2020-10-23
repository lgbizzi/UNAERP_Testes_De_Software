package classes;

public final class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente, int agencia, int numero, double saldo, double limite){
        super(cliente, agencia, numero, saldo, limite);
    }
}