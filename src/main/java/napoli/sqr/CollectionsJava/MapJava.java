package napoli.sqr.CollectionsJava;

import java.util.*;

public class MapJava {

    public static void main(String[] args) {

        System.out.println("Crie um dicionario qque relacione os modelos e seus respectivos itens.");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
                put("gol", 14.1);
                put("uno", 6.1);
                put("mobi", 98.1);
                put("hb20", 20.1);
                put("kwid", 12.1);
                put("x6", 45.1);
            }};

        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("Contém supra: " + carrosPopulares.containsKey("supra"));

        System.out.println("Uno: " + carrosPopulares.get("uno"));

        System.out.println("Modelos: " + carrosPopulares.keySet());
        System.out.println("Consumos: " + carrosPopulares.values());


        Double maiorConsumo = Collections.max(carrosPopulares.values());
        String modeloMenosEficiente = "";


        Set<Map.Entry<String, Double>> setMap = carrosPopulares.entrySet();
        for (Map.Entry<String, Double> entry : setMap) {
            if (entry.getValue().equals(maiorConsumo)) {
                modeloMenosEficiente = "Modelo: " + entry.getKey() + "\nConsumo: " + entry.getValue();
            }
        }
        System.out.println(modeloMenosEficiente);
    }
}