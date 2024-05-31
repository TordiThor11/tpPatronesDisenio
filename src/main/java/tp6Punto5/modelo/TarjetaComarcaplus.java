package tp6Punto5.modelo;

import java.util.List;

public class TarjetaComarcaplus extends Tarjeta {

    public TarjetaComarcaplus(int numeroTarjeta, double saldo, List<Observer> observadores) {
        super(numeroTarjeta, saldo, observadores);
    }

    public void pagar(double propinaPorcentaje, Pedido miPedido) throws IllegalStateException {
        double montoTotal = miPedido.contarMontoPlatoPrincipal() + miPedido.contarMontoBebida();
        montoTotal = descontarPorPorcentaje(montoTotal, 2); //Descuento de 2% en todos los productos
        montoTotal = agregarPorPorcentaje(montoTotal, propinaPorcentaje);
        if (!(this.saldo - montoTotal >= 0)) {
            throw new IllegalStateException("Saldo insuficiente para realizar la transaccion");
        }
        this.saldo -= montoTotal;
        notificar(montoTotal);
    }
}
