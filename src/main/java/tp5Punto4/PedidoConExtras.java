package tp5Punto4;

public abstract class PedidoConExtras implements Pedido {
    protected Pedido pedido;

    public PedidoConExtras(Pedido pedido) {
        this.pedido = pedido;
    }

}
