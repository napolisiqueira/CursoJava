package napoli.sqr.CollectionsJava.Exercicio3;

import java.util.*;


public class ArcoIris {

    public static void main(String[] args) {

        Set<String> ArcoIris = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));

        Iterator<String> iterator = ArcoIris.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println(ArcoIris.size());

        List<String> ListColors = new ArrayList<>(ArcoIris);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s3, String s2) {
                return s3.compareTo(s2);
            }
        };
        Collections.sort(ListColors, comparator);
        LinkedHashSet<String> arcoIris = new LinkedHashSet<String>(ListColors);

        for (String i : arcoIris) {
            System.out.println(i);
        }

        for (String n : arcoIris.reversed()) {
            System.out.println(n);
        }


        for (String g : arcoIris) {
            String n = g.toLowerCase();
            if (n.startsWith("v")) {
                System.out.println(g);
            }
        }

        Iterator<String> iterator1 = arcoIris.iterator();
        while (iterator1.hasNext()) {
            String next = iterator1.next();
            if (!next.startsWith("V")) {
                iterator1.remove();
            }
        }

        System.out.println(arcoIris);
        for (String g : arcoIris) {
            System.out.println(g);

        }

        arcoIris.clear();
        System.out.println(arcoIris);
    }
}