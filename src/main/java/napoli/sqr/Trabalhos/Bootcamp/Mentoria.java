package napoli.sqr.Trabalhos.Bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria: " + this.getTitulo() + "\n" +
                "Descrição: " + this.getDescricao() + "\n" +
                "Data: " + this.getData();
    }

    @Override
    public double calcularXP() {
        return XP_TOTAL += 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


}
