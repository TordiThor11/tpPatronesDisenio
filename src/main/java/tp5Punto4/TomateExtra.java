package tp5Punto4;

public class TomateExtra extends PedidoConExtras {
    int precio;
    String detalle;

    public TomateExtra(Pedido pedido) {
        super(pedido);
        this.precio = 1;
        this.detalle = "tomate";
    }

    @Override
    public int valor() {
        int valor = pedido.valor();
        return valor + this.precio;
    }
}
