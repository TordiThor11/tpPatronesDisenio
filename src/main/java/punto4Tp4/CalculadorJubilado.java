package punto4Tp4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends Calculador {
    public CalculadorJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    double cantidadDescuento() {
        double cantidadDescuento = 1; //No hay descuento
        if (!of(mesEnPromocion).equals(now().getMonth())) {
            cantidadDescuento = 0.1;    //90% de descuento
        }
        return cantidadDescuento;
    }
}