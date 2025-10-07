package napoli.sqr.Trabalhos.SelecaoBanca;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class SistemaDeValidacao {

    public static void main(String[] args) {
        ArrayList<String> list = selecaoCandidatos();
        if (list.isEmpty()) {
            System.out.println("Nenhum candidato foi escolhido.");

        } else {
            imprimirSelecionados(list);
        }
    }


    static void imprimirSelecionados (ArrayList<String> list) {
        for (int index = 0; index < list.size(); index++) {
            System.out.printf("O candidado de numero %d é %s.\n", index + 1, list.get(index));
        }
    }

    static ArrayList<String> selecaoCandidatos() {
        String[] candidatos = {"Maria", "João", "Nathalya", "Katiusha", "Isabela", "Clara", "Lebron"};
        ArrayList<String> lista = new ArrayList<>(5);

        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase = 2000.00;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = salarioPretendido();

            System.out.printf("O candidato(a) %s solicitou o valor de R$%.2f\n", candidato, salarioPretendido);
            if (salarioPretendido < salarioBase) {
                System.out.printf("O candidato(a) %s foi selecionado!\n", candidato);
                candidatosSelecionados++ ;
                lista.add(candidato);
            }
            candidatosAtual++;
        }
        return lista;
    }

    static double salarioPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}