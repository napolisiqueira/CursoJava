package napoli.sqr.Trabalhos.terminalBank;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu banco: ");
        String banco = scanner.nextLine();

        System.out.println("Digite o numero da Agencia: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o seu saldo inicial: ");
        Double saldo =  scanner.nextDouble();

        System.out.printf("Ola %s, obrigado por criar uma conta no banco %s. Sua agencia é %d, e seu saldo no valor" +
                " de R$%f já está disponivel para cheque", nome, banco, agencia, saldo);

        scanner.close();
    }
}

