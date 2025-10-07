package napoli.sqr.CollectionsJava.Exercicio4;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class FavLanguages {

    public static class Linguagem {
        String name;
        String ide;
        int anoCriacao;

        public Linguagem(String name, String ide, int anoCriacao) {
            this.name = name;
            this.ide = ide;
            this.anoCriacao = anoCriacao;
        }

        @Override
        public String toString() {
            return "Linguagem{" +
                    "name='" + name + '\'' +
                    ", ide='" + ide + '\'' +
                    ", anoCriacao=" + anoCriacao +
                    '}';
        }
    }

    public static void main(String[] args) {

        Linguagem python = new Linguagem("Python", "PyCharm", 1989);
        Linguagem java = new Linguagem("Java", "IntelliJ", 1995);
        Linguagem golang = new Linguagem("Go", "GoLand", 2008);
        List<Linguagem> listLinguagem = new ArrayList<Linguagem>(Arrays.asList(python, java, golang));

        Comparator<Linguagem> comparator = new Comparator<Linguagem>() {
            @Override
            public int compare(Linguagem o1, Linguagem o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        System.out.println(listLinguagem);
        Collections.sort(listLinguagem, comparator);
        System.out.println(listLinguagem);
    }


}

