package tp6Punto5.modelo;

import java.util.List;

public class TarjetaViedma extends Tarjeta {


    public TarjetaViedma(int numeroTarjeta, double saldo, List<Observer> observadores) {
        super(numeroTarjeta, saldo, observadores);
    }
}
