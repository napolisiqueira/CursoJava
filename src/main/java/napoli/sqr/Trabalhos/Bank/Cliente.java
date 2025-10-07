package napoli.sqr.Trabalhos.Bank;

import java.util.List;

public class Cliente {
    private static int id;
    private String name;
    private String cpf;

    public Cliente (String nome, String cpf){
        id ++;
        setCpf(cpf);
        setName(nome);

    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setName(String nome){
        this.name = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
