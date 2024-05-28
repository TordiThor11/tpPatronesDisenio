package tp5Punto4;

public class PedidoBuilder {
    private Pedido pedido;

    public PedidoBuilder(Pedido pedido) {
        this.pedido = pedido;
    }

    public PedidoBuilder agregarPapa() {
        this.pedido = new PapaExtra(pedido);
        return this;
    }

    public PedidoBuilder agregarTomate() {
        this.pedido = new TomateExtra(pedido);
        return this;
    }

    public Pedido build() {
        return this.pedido;
    }

}
