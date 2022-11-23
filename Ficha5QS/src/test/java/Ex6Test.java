import org.example.Ex6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex6Test {

    Ex6 calculoEx6;

    @BeforeEach
    public void setUp(){
        calculoEx6 = new Ex6();

    }

    @Test
    @DisplayName("Teste do ex6")
    public void avrgDigitos(){
        double avrg = calculoEx6.avrgDigitos(123456);
        assertEquals(5,avrg,"Cao 1:Media Errada");
    }

}
