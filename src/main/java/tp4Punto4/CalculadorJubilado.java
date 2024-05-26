package tp4Punto4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends Calculador {

    private static final double CANTIDAD_DESCUENTO = 0.1; //90% de descuento

    public CalculadorJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    double cantidadDescuento() {
        double cantidadDescuento = 1; //No hay descuento
        if (!of(mesEnPromocion).equals(now().getMonth())) {
            cantidadDescuento = CANTIDAD_DESCUENTO;
        }
        return cantidadDescuento;
    }
}