package classes;

public final class ContaBancaria extends Conta{
    public ContaBancaria(Cliente cliente, int agencia, int numero, double saldo, double limite){
        super(cliente, agencia, numero, saldo, limite);
    }
}