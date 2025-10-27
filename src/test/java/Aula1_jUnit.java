import napoli.sqr.CollectionsJava.CatsList.Cats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class Aula1_jUnit {


    @Test
    void testarExercicio2Io () {
        Cats cat = new Cats("Abacate", LocalDateTime.of(2000, 1, 1, 15, 0, 0), "Branco");

        Assertions.assertEquals(22, cat.getIdade());
    }

}
