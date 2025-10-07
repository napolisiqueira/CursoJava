package napoli.sqr.modulo3;

import java.util.Locale;
import java.util.Scanner;

public class ScannerTraine {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.printf("Seu nome é %s %s, tem %d anos e %f de altura", nome, sobrenome, idade, altura);
        scanner.close();
    }
}
