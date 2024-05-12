package tp4Punto4;

public abstract class Calculador {
    protected int mesEnPromocion;

    public Calculador(int mesEnPromocion) {
        this.mesEnPromocion = mesEnPromocion;
    }

    public double calcularPrecio(double precioProducto) {
        return precioProducto * cantidadDescuento();
    }

    abstract double cantidadDescuento();

}
