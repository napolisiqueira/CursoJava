package napoli.sqr.Trabalhos.Bootcamp;

import java.util.ArrayList;
import java.util.List ;
import java.util.Arrays ;



public class Curso extends Conteudo{
    private int cargaHoraria;
    private List<String> categoria = new ArrayList<String>();

    public Curso(String titulo, String descricao, int cargaHoraria, List<String> categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        String categoriasString = String.join(", ", this.getCategoria());

        return  "Curso: " + this.getTitulo() + "\n" +
                "Descrição: " + this.getDescricao() + "\n" +
                "Carga Horaria: " + this.getCargaHoraria() + "\n" +
                "Categoria: " + categoriasString;
    }

    @Override
    public double calcularXP() {
        return XP_TOTAL += 10d;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<String> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<String> categoria) {
        this.categoria = categoria;
    }
}
