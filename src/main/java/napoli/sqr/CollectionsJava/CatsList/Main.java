package napoli.sqr.CollectionsJava.CatsList;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Cats Cat1 = new Cats();
        Cats Cat2 = new Cats();
        Cats Cat3 = new Cats();
        Cats Cat4 = new Cats();
        Cats Cat5 = new Cats();
        Cat1.setCat("Cobre", "Marrom", 3 );
        Cat2.setCat("Cobalto", "Malhado", 2 );
        Cat3.setCat("Tuquistenio", "Branco", 8);
        Cat4.setCat("Cessio", "Preto", 3 );
        Cat5.setCat("Ruan", "Branco", 5 );

        List<Cats> cats = Arrays.asList(Cat1, Cat2, Cat3, Cat4, Cat5);
        List<Cats> ListCats = new ArrayList<>();
        ListCats.addAll(cats);

        ListCats.addAll(cats);

        System.out.println(ListCats);
        Collections.shuffle(ListCats);
        Collections.sort(ListCats);

//        Collections.sort(ListCats, new CompareCats());
//        System.out.println(ListCats);

        ListCats.sort(new CompareCats());
        System.out.println(ListCats);



    }
}
