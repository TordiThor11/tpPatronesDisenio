package tp6Punto1.modelo;

import java.util.List;

public class Observable {
    private List<Observer> observadores;

    public Observable(List<Observer> observadores) {
        this.observadores = observadores;
    }

    protected void notificar(String info) {
        this.observadores.stream().forEach((o) -> o.actualizar(info));
    }
}
