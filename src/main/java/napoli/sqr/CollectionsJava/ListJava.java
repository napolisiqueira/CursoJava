package napoli.sqr.CollectionsJava;

import java.util.*;

public class ListJava {
    public static void main(String[] args) {

        List<Double> listaNotas = new ArrayList<>();

        List<Double> notas = Arrays.asList(7d, 8.5, 5d, 0d, 3.6);
        listaNotas.addAll(notas);

        System.out.println(listaNotas);

        listaNotas.add(5d);

        System.out.println("Essa é a posição da ultima nota: " + listaNotas.indexOf(0d));

        listaNotas.add(3, 8d);

        System.out.println(listaNotas.toString());

        listaNotas.set(3, 9d);

        System.out.println(listaNotas.toString());

        System.out.println("A nota 5.0 está na lista de notas: " + listaNotas.contains(5d));
        System.out.println("A nota da posição 4 é: " +  listaNotas.get(5));


        System.out.println("A menor nota da lista é: " + Collections.min(listaNotas));
        System.out.println("A maior nota da lista é: " + Collections.max(listaNotas));



        Iterator<Double> iterator = listaNotas.iterator();

        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma de todos os valores: " + soma);

        System.out.println("Exiba a media de todos os valores: " + (soma/listaNotas.size()));


        listaNotas.remove(3);
        System.out.println(listaNotas);

        Iterator<Double> iterator1 = listaNotas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                listaNotas.remove(listaNotas.indexOf(next));
            } else {
                break;
            }
        }
        System.out.println(listaNotas);


    }
}
