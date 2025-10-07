package napoli.sqr.CollectionsJava.Exercicio5;

import java.util.*;

public class Populacao {


    public static void main(String[] args) {
        Map<String, Integer> populacaoEstado = new HashMap<String, Integer>() {{

            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println("Estado/População: " + populacaoEstado);
        populacaoEstado.put("RN", 3534165);
        System.out.println("Estado/População: " + populacaoEstado);

        System.out.println("O estado de PE está presente: " + populacaoEstado.containsKey("PE"));
        if (!populacaoEstado.containsKey("PE")) {
            populacaoEstado.put("PE", 4039277);
        }
        System.out.println("Estado/População: " + populacaoEstado);
        System.out.println("Estado PE: " + populacaoEstado.get("PE"));

        populacaoEstado.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey())
                .forEach(System.out::println);


        Set<Map.Entry<String, Integer>> setMap = populacaoEstado.entrySet();
        Integer maiorPopulacao = Collections.max(populacaoEstado.values());
        for (Map.Entry<String, Integer> entryes : setMap) {
            if (entryes.getValue().equals(maiorPopulacao)) {
                System.out.println("O maior população é de " + entryes.getKey() + " com " + entryes.getValue());
            }
        }

        Integer menorPopulacao = Collections.min(populacaoEstado.values());
        for (Map.Entry<String, Integer> entryes : setMap) {
            if (entryes.getValue().equals(menorPopulacao)) {
                System.out.println("A menor população é de " + entryes.getKey() + " com " + entryes.getValue());
            }
        }

        Integer soma = 0;
        for (Integer i : populacaoEstado.values()) {
            soma += i;
        }
        System.out.println("A soma de todo a população é de um total de: " + soma);


        List<String> listRemove = new ArrayList<>();

        for (Map.Entry<String, Integer> entryes : setMap) {
            if (entryes.getValue() < 4000000) {
                listRemove.add(entryes.getKey());
            }
        }

        for (String i : listRemove) {
            populacaoEstado.remove(i);
        }

        System.out.println("Essas são todas as cidades com mais de 400000 habitantes: " + populacaoEstado);


        populacaoEstado.clear();
        System.out.println(populacaoEstado);
    }
}