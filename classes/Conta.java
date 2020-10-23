package classes;

public abstract class Conta{
    private double saldo = 0;
    private int agencia;
    private int numero;
    private Cliente cliente;
    private double limite;

    public Conta(Cliente cliente, int agencia, int numero, double saldo, double limite){
        super();
        this.cliente = cliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void depositar(double valor) throws IllegalArgumentException{
        if(valor <=0){
            throw new IllegalArgumentException("Impossivel depositar valor negativo!");
        }

        this.saldo += valor;
    }

    public double sacar(double valor){
        if(valor<=0){
            throw new IllegalArgumentException("Impossivel sacar valor negativo!");
        }

        if((this.saldo - valor) > limite){
            throw new IllegalAccessException("Limite insuficiente!");
        }

        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.print("/nOperacao Concluida com exito!");
        }

        return this.saldo;
    }

    public boolean transferir(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.print("/nOperacao Concluida com exito!");
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0){
            System.out.println("/nNao e possivel valores negativos");
            return;
        }
        this.numero = numero;
    }
    
    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0){
            System.out.println("/nNao e possivel valores negativos");
            return;
        }
        this.agencia = agencia;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getLimite(){
        return this.limite;
    }
}