package napoli.sqr.Trabalhos.Bootcamp;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscrever (Bootcamp bootcamp) {
        this.conteudosIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);
    };

    public void progredir () {
        Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIncritos.remove(conteudo.get());
        } else {
            System.out.println("Não há conteúdos para serem progredidos.");
        }
    };
    public double calcularXP () {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXP)
                .sum();
    };


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<String> getConteudosIncritos() {
        return conteudosIncritos;
    }

    public void setConteudosIncritos(Set<String> conteudosIncritos) {
        this.conteudosIncritos = conteudosIncritos;
    }

    public Set<String> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<String> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
}
