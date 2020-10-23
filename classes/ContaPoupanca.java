package classes;

public final class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente, int agencia, int numero, double saldo, double limite){
        super(cliente, agencia, numero, saldo, limite);
    }
}