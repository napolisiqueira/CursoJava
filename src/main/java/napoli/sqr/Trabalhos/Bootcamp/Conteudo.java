package napoli.sqr.Trabalhos.Bootcamp;

public abstract class Conteudo {

    protected static double XP_TOTAL = 10d;
    protected String titulo;
    protected String descricao;
    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
