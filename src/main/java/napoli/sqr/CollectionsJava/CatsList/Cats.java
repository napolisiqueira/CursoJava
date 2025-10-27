package napoli.sqr.CollectionsJava.CatsList;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cats implements Comparable<Cats> {
    private String nome;
    private LocalDateTime idade;
    private String cor;

    public Cats(String nome, LocalDateTime idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }
    public LocalDateTime getIdade() {
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


