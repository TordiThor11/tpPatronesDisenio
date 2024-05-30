package tp6Punto4.model;

import java.util.List;

public class Observable {
    private List<Observer> observadores;

    public Observable(List<Observer> observadores) {
        this.observadores = observadores;
    }

    public void notificar(Participante participante) {
        this.observadores.stream().forEach((o) -> o.actualizar(participante));
    }
}
