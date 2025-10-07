package napoli.sqr.Trabalhos.Bank;

public class ContaPoupanca extends Conta {

    public ContaPoupanca (String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("================= EXTRATO CONTA POUPANÇA=================");
        super.imprimirExtrato();
    }
}
