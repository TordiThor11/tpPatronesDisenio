package tp6Punto5.modelo;

import java.util.List;

public class Observable {
    private List<Observer> observadores;

    public Observable(List<Observer> observadores) {
        this.observadores = observadores;
    }

    public void notificar(double monto) {
        this.observadores.stream().forEach((o) -> o.actualizar(monto));
    }
}
