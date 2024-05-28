package tp5Punto4;

public class ComboEspecial implements Pedido {
    int precio;
    String detalle;

    public ComboEspecial() {
        this.precio = 10;
        this.detalle = "Combo especial";
    }

    @Override
    public int valor() {
        return this.precio;
    }
}
