package napoli.sqr.CollectionsJava.Exercicio1;

import java.util.*;




public class exe {

    public static void main( String[] args) {
        List<Double> listTemp = new ArrayList<Double>();
        List<Double> temps = Arrays.asList(10d, 12d, 14.7, 20d, 33.8, 27d);
        listTemp.addAll(temps);

        System.out.println("Essa é a lista de temperaturas: " + listTemp);

        Double soma = 0d;
        Iterator<Double> iterator = listTemp.iterator();
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Essa é a média de temperatura semestral: " + soma / listTemp.size());

        List<Mes> MesesAcima = new ArrayList<Mes>();
        List<String> Meses = new ArrayList<String>();
        List<String> meses = Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Julho", "Junho");
        Meses.addAll(meses);

        Double media = soma / listTemp.size();

        for (int i = 0; i < listTemp.size(); i++) {
            Double tempAtual = listTemp.get(i);

            if (tempAtual > media) {
                String nomeMes = Meses.get(i);

                MesesAcima.add(new Mes(nomeMes, tempAtual));
            }
        }

        System.out.println("\nMeses com temperatura acima da média (" + media + "):");
        System.out.println(MesesAcima);
    }



    public static class Mes {
        String Mes;
        Double Temp;

        public Mes(String mes, Double temp) {
            this.Mes = mes;
            this.Temp = temp;
        }

        @Override
        public String toString() {
            return "Mes= " + Mes + " Temp= " + Temp;
        }
    }

}
