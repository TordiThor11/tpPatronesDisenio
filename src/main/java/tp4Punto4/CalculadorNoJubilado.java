package tp4Punto4;

public class CalculadorNoJubilado extends Calculador {

    public CalculadorNoJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    protected double mesSinPromocion(double precioProducto) {
        return precioProducto * 0.21;//79% de descuento
    }

    @Override
    protected double mesConPromocion(double precioProducto) {
        return precioProducto * 0.15;//85% de descuento
    }

   /* @Override
    double cantidadDescuento() {
        double cantidadDescuento = 1; //No hay descuento
        if (of(mesEnPromocion).equals(now().getMonth())) {
            cantidadDescuento = 0.15;//85% de descuento
        } else {
            cantidadDescuento = 0.21;//79% de descuento
        }
        return cantidadDescuento;
    }*/
}
