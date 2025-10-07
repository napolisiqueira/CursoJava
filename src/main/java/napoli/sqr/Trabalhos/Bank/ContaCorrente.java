package napoli.sqr.Trabalhos.Bank;

public class ContaCorrente extends Conta{

    public ContaCorrente(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("====================EXTRATO CONTA CORRENTE=================");
        super.imprimirExtrato();
    }
}
