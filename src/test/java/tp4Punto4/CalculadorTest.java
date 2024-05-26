package tp4Punto4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.time.LocalDate.now;

class CalculadorTest {
    @Test
    public void calcularJubiladoSinPromocion() {
        var calculador = new CalculadorJubilado(now().getMonth().getValue() + 2);
        Assertions.assertEquals(100, calculador.calcularPrecio(100));
    }

    @Test
    public void calcularNoJubiladoSinPromocion() {
        var calculador = new CalculadorNoJubilado(now().getMonth().getValue() + 2);
        Assertions.assertEquals(21, calculador.calcularPrecio(100));
    }

    @Test
    public void calcularJubiladoConPromocion() {
        var calculador = new CalculadorJubilado(now().getMonth().getValue());
        Assertions.assertEquals(10, calculador.calcularPrecio(100));
    }

    @Test
    public void calcularNoJubiladoConPromocion() {
        var calculador = new CalculadorNoJubilado(now().getMonth().getValue());
        Assertions.assertEquals(15, calculador.calcularPrecio(100));
    }

}