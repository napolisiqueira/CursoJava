package napoli.sqr.CollectionsJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class SetJava {

    public static void main(String[] args) {

        Set<Integer> setInteger = new HashSet<Integer>(Arrays.asList(7, 8, 9, 4, 6, 5, 3, 2, 1));


        System.out.println("Set é: " + setInteger);
        System.out.println("A menor nota do set é: " + Collections.min(setInteger));
        System.out.println("A maior nota do set é: " + Collections.max(setInteger));


    }

}
