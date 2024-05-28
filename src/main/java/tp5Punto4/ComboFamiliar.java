package tp5Punto4;

public class ComboFamiliar implements Pedido {
    int precio;
    String detalle;

    public ComboFamiliar() {
        this.precio = 15;
        this.detalle = "combo familiar";
    }

    @Override
    public int valor() {
        return this.precio;
    }
}
