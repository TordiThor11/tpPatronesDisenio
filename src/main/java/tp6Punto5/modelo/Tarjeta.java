package tp6Punto5.modelo;

import java.util.List;

abstract class Tarjeta extends Observable {
    protected int numeroTarjeta;
    protected double saldo;

    public Tarjeta(int numeroTarjeta, double saldo, List<Observer> observadores) {
        super(observadores);
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
    }


    public void pagar(double propinaPorcentaje, Pedido miPedido) throws IllegalStateException {
        double montoPlatoPrincipal = miPedido.contarMontoPlatoPrincipal();
        double montoBebida = miPedido.contarMontoBebida();
        double montoTotal = montoPlatoPrincipal + montoBebida;
        montoTotal = agregarPorPorcentaje(montoTotal, propinaPorcentaje);
        if (!(this.saldo - montoTotal >= 0)) {
            throw new IllegalStateException("Saldo insuficiente para realizar la transaccion");
        }
        this.saldo -= montoTotal;
        notificar(montoTotal);
    }

    public double getSaldo() {
        return this.saldo;
    }

    protected double agregarPorPorcentaje(double monto, double porcentaje) {
        return monto * (100.0 + porcentaje) / 100;
    }

    protected double descontarPorPorcentaje(double monto, double porcentaje) {
        return monto * (100.0 - porcentaje) / 100;
    }
}
