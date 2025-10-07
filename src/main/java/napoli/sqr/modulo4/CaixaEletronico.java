package napoli.sqr.modulo4;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17;

        if (valorSolicitado > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo = saldo - valorSolicitado;
            System.out.printf("Saque de %f", saldo);
        }
    }
}