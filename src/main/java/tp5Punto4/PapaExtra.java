package tp5Punto4;

public class PapaExtra extends PedidoConExtras {
    int precio;
    String detalle;

    public PapaExtra(Pedido pedido) {
        super(pedido);
        this.precio = 2;
        this.detalle = "papa";
    }

    @Override
    public int valor() {
        int valor = pedido.valor();
        return valor + this.precio;
    }
}
