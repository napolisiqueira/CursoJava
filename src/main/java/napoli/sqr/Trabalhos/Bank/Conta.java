package napoli.sqr.Trabalhos.Bank;

import java.util.List;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int NumeroSeq = 0;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente titular;


    public Conta (String nome, String cpf) {
        this.saldo = 0;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = NumeroSeq++;
        this.titular = new Cliente(nome, cpf);
    }


    @Override
    public void sacar(double valor){
        if (valor < this.saldo)
            this.saldo -= valor;
        else {
            System.out.println("Não foi possivel sacar.");
        }
    }

    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor){
        if (valor < saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("==================TRANSFERENCIA===================");
            System.out.println(String.format("Valor %f transferido da conta de %s para conta de %s.", valor, this.titular.getName(), contaDestino.titular.getName()));
        } else {
            System.out.println("==================TRANSFERENCIA===================");
            System.out.println("Não foi possivel transferir. Saldo insuficiente.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(String.format("Cliente: %s", this.titular.getName()));
        System.out.println(String.format("Agencia: %d", getAgencia()));
        System.out.println(String.format("Conta: %d", getNumero()));
        System.out.println(String.format("Saldo: %.2f", getSaldo()));
    }


    public int getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public double getSaldo() {
        return saldo;
    }
}
