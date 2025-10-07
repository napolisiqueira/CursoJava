package napoli.sqr.CollectionsJava.CatsList;

import java.util.Comparator;

public class CompareCats implements Comparator<Cats> {

    @Override
    public int compare(Cats c1, Cats c2) {
        return Integer.compare(c1.getIdade(), c2.getIdade());
    }
}


