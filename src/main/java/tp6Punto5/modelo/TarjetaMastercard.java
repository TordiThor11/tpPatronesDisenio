package tp6Punto5.modelo;

import java.util.List;

public class TarjetaMastercard extends Tarjeta {

    public TarjetaMastercard(int numeroTarjeta, double saldo, List<Observer> observadores) {
        super(numeroTarjeta, saldo, observadores);
    }

    public void pagar(double propinaPorcentaje, Pedido miPedido) throws IllegalStateException {
        double montoTotal = miPedido.contarMontoPlatoPrincipal();
        montoTotal = descontarPorPorcentaje(montoTotal, 2); //Descuento de 2% en platos principales
        montoTotal += miPedido.contarMontoBebida();
        montoTotal = agregarPorPorcentaje(montoTotal, propinaPorcentaje);
        if (this.saldo - montoTotal >= 0) {
            this.saldo -= montoTotal;

            notificar(montoTotal);
        } else {
            throw new IllegalStateException("Saldo insuficiente para realizar la transaccion");
        }
    }
}
