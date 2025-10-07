package napoli.sqr.CollectionsJava.Exercicio2;

import java.util.*;

public class Interrogatorio {

    // 2 - Suspeita
    // 3 ou 4 - Cumplice
    // 5 - Assassino

    public static void main(String[] args) {
        List<String> listaPerguntas = new ArrayList<String>();
        List<String> lista = Arrays.asList("Telefonou para a vitima? ", "Esteve no local do crime? ", "Mora perto da vitima? ", "Devia para a vitima? ", "Ja trabalhou  com a vitima? ");
        listaPerguntas.addAll(lista);

        Scanner read = new Scanner(System.in);


        Iterator<String> iterator = listaPerguntas.iterator();
        Integer points = 0;

        while(iterator.hasNext()) {
            String next = iterator.next();
        
            System.out.println(next);
            String resp = read.next();

            if (Objects.equals(resp, "sim")) points += 1;
        }
        
        if (points == 2 || points == 1) {
            System.out.println("Suspeita");
        } else if (points == 3 || points == 4) {
            System.out.println("Cumplice");
        } else if (points == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}
