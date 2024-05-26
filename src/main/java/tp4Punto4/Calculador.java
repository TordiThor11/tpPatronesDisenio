package tp4Punto4;

import static java.time.LocalDate.now;

public abstract class Calculador {
    protected int mesEnPromocion;

    public Calculador(int mesEnPromocion) {
        this.mesEnPromocion = mesEnPromocion;
    }

    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (mesEnPromocion == now().getMonth().getValue()) {
            precioTotal = mesConPromocion(precioProducto);
        } else {
            precioTotal = mesSinPromocion(precioProducto);
        }
        return precioTotal;
    }

//    abstract double cantidadDescuento();

    protected abstract double mesSinPromocion(double precioProducto);

    protected abstract double mesConPromocion(double precioProducto);

}
