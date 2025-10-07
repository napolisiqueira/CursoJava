package napoli.sqr.CollectionsJava.CatsList;

import java.util.Comparator;

public class CompareCatsColor implements Comparator<Cats> {

    @Override
    public int compare(Cats c1, Cats c2) {
        return  c1.getCor().compareToIgnoreCase(c2.getCor());
    }
}
