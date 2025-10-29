import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


@ExtendWith(MockitoExtension.class)
public class Aula2_Mockito {

    @Mock
    private List<String> letters;

    @Test
    void addItemInList() {
        Mockito.when(letters.getFirst()).thenReturn("B");
    }
}
