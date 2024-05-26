package tp4Punto4;

public class CalculadorJubilado extends Calculador {

    private static final double CANTIDAD_DESCUENTO = 0.1; //90% de descuento

    public CalculadorJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    protected double mesSinPromocion(double precioProducto) {
        return precioProducto;
    }

    @Override
    protected double mesConPromocion(double precioProducto) {
        return precioProducto * CANTIDAD_DESCUENTO;
    }

    /*@Override
    double cantidadDescuento() {
        double cantidadDescuento = 1; //No hay descuento
        if (!of(mesEnPromocion).equals(now().getMonth())) {
            cantidadDescuento = CANTIDAD_DESCUENTO;
        }
        return cantidadDescuento;
    }*/
}