package tp5Punto4;

public class ComboBasico implements Pedido {
    int precio;
    String detalle;

    public ComboBasico() {
        this.precio = 5;
        this.detalle = "combo basico";
    }

    @Override
    public int valor() {
        return this.precio;
    }
}
