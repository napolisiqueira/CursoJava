package napoli.sqr.Trabalhos.Bank;

public class Principal {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("Napoli", "479.258.608-98");
        Conta cp = new ContaPoupanca("Napoli", "479.258.608-98");

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        Conta cq = new ContaCorrente("Giovanna", "857.456.987.-56");

        cq.depositar(4500);
        cp.depositar(600);
        cc.depositar(500);
        cc.imprimirExtrato();
        cq.imprimirExtrato();
        cp.imprimirExtrato();

        cq.transferir(cc, 3200);

        cq.imprimirExtrato();
        cc.imprimirExtrato();

        cq.transferir(cp, 8000);


    }
}
