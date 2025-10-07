package napoli.sqr.modulo1;

public  class Operates {

    public static void main(String[] args) {
        int numero = 5;
        numero =+ numero;

        System.out.println(numero);

        numero =- numero;

        System.out.println(numero);


         //Para converter o sinal de um numero se aplica a regra
         //comum da matematica. sinais iguais = + / sinais diferentes = -


    }

    public static void incrementDecrement (String[] args) {
        int numero = 5;


         //Esses são operadores de incrementação de decrementação.
         //Lembrando que esses valores são em memoria até que seja declarado um novo valor.


        System.out.println( ++ numero);
        System.out.println( -- numero);

        boolean variavel = true;
        if (!variavel) variavel = true;
        else variavel = false;
        System.out.println(variavel);
    }

    public static void BooleansVar (String[] args) {
        boolean variable = true;

        System.out.println(!variable);
        System.out.println(variable);
    }

    public static void ternarianOperator (String[] args) {
        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);


         //Isso é uma expressão booleana, sempre retornando verdadeiro ou falso.

    }

    public static void OperatorRelacional (String[] args) {
        int a, b;
        a = 5;
        b = 6;

        boolean yesOrNo = a == b;
        System.out.println("Numero A é igual a numero B? " + yesOrNo);

        yesOrNo = a != b;
        System.out.println("Numero A é difenrente do numero B? " + yesOrNo);

        yesOrNo = a < b;
        System.out.println("Numero A é menor que o numero B? " + yesOrNo);

        if (a < b) {
            System.out.println("True!! O numero A é menor que o numero B!");
        }


         //Para objeto o mais adequado seria umar metodos como "equals",
         //já para numeros os operadores de simbolo servem de maneira mais adequada.


        String nomeUm = "NAPOLI";
        String nomeDois = "NAPOLI";

        System.out.println(nomeUm.equals(nomeDois));
    }

    public static void LogicOperator(String[] args) {

         //Nada alem da tabela verdade. É a junção de duas ou mais condições.


        boolean condOne = true;
        boolean condTwo = false;

        if (condOne && condTwo) {
            System.out.println("True!");
        }
        if (condOne || condTwo) {
            System.out.println("False!");
        }
    }
}