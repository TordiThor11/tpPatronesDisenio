package punto4Tp4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador {

    public CalculadorNoJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    double cantidadDescuento() {
        double cantidadDescuento = 1; //No hay descuento
        if (of(mesEnPromocion).equals(now().getMonth())) {
            cantidadDescuento = 0.15;//85% de descuento
        } else {
            cantidadDescuento = 0.21;//79% de descuento
        }
        return cantidadDescuento;
    }
}
