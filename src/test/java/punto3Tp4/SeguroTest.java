package punto3Tp4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SeguroTest {
    @Test
    public void valorTotalPaquete() {
        var paquete = new Paquete();
        paquete.addSeguro(new Hogar(100));
        paquete.addSeguro(new Hogar(1000));
        Assertions.assertEquals(1045, paquete.calcularValor());
    }

    @Test
    public void valorTotalPaqueteSurtido() {
        var paquete = new Paquete();
        paquete.addSeguro(new Hogar(100));
        paquete.addSeguro(new Hogar(1000));
        paquete.addSeguro(new Vida(100));
        Assertions.assertEquals(1140, paquete.calcularValor());
    }
}