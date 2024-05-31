package tp6Punto5.modelo;

import java.util.List;

public class TarjetaVisa extends Tarjeta {


    public TarjetaVisa(int numeroTarjeta, double saldo, List<Observer> observadores) {
        super(numeroTarjeta, saldo, observadores);
    }

    public void pagar(double propinaPorcentaje, Pedido miPedido) throws IllegalStateException {
        double montoTotal = miPedido.contarMontoBebida();
        montoTotal = descontarPorPorcentaje(montoTotal, 3); //Descuento de 3% en bebidas
        montoTotal += miPedido.contarMontoPlatoPrincipal();
        montoTotal = agregarPorPorcentaje(montoTotal, propinaPorcentaje);
        if (this.saldo - montoTotal >= 0) {
            this.saldo -= montoTotal;

            notificar(montoTotal);
        } else {
            throw new IllegalStateException("Saldo insuficiente para realizar la transaccion");
        }
    }
}
