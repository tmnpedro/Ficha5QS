import org.example.Retangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RetanguloTest {
    Retangulo retangulo;
    @BeforeEach
    public void setUp(){
        retangulo = new Retangulo();
    }

    @Test
    public void area(){
        int resultado = retangulo.area(3,5);
        assertEquals(15,resultado);
        resultado = retangulo.area(5,8);
        assertEquals(40,resultado);
        resultado = retangulo.area(2,4);
        assertEquals(8,resultado);
    }

    @Test
    public void perimetro(){
        int resultado = retangulo.perimetro(3,5);
        assertEquals(16,resultado);
        resultado = retangulo.perimetro(5,8);
        assertEquals(26,resultado);
        resultado = retangulo.perimetro(2,4);
        assertEquals(16,resultado);
    }

}
