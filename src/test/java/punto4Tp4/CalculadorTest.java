package punto4Tp4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadorTest {
    @Test
    public void calcularJubilado() {
        var calculador = new CalculadorJubilado(12);
        Assertions.assertEquals(10, calculador.calcularPrecio(100));
    }

    @Test
    public void calcularNoJubilado() {
        var calculador = new CalculadorNoJubilado(12);
        Assertions.assertEquals(21, calculador.calcularPrecio(100));
    }

}