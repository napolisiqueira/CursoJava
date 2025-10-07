package napoli.sqr.modulo1;

public class BoletimEscolar {

    public static int mathCount (int nota1, int nota2) {
        return (nota1 + nota2) / 2 ;
    }
    public static void printsInterface (int valor) {
        System.out.println("A media do aluno é de " + valor);
    }

    public static void main (String [] args) {
        int valor;
        valor = mathCount(7, 6);
        printsInterface(valor);
    }

}