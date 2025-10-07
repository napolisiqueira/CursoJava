package napoli.sqr.CollectionsJava.CatsList;

public class Cats implements Comparable<Cats> {
    private String nome;
    private Integer idade;
    private String cor;


    public void setCat(String nome, String cor, Integer idade ) {
        this.cor = cor;
        this.nome = nome;
        this.idade = idade;
    }


    public String getCor() {
        return this.cor;
    }
    public Integer getIdade() {
        return this.idade;
    }
    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Gato: " + this.nome + ", com " + this.idade + " anos, da cor " + this.cor + ".";
    }

    @Override
    public int compareTo(Cats cat) {
        return this.getNome().compareToIgnoreCase(cat.getNome());
    }



}


